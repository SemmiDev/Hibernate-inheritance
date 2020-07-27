package com.learn.amigoscode;

import com.learn.amigoscode.dao.GuruDao;
import com.learn.amigoscode.dao.MahasiswaDao;
import com.learn.amigoscode.dao.SiswaDao;
import com.learn.amigoscode.entitas.Guru;
import com.learn.amigoscode.entitas.Mahasiswa;
import com.learn.amigoscode.entitas.Siswa;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AmigoscodeApplicationTests {

	@Autowired
	SiswaDao siswaDao;
	@Autowired
	MahasiswaDao mahasiswaDao;
	@Autowired
	GuruDao guruDao;

	@Test
	public void insertTest() {
		Siswa siswa = new Siswa();
		siswa.setNama("Ayatullah Ramaadhan");
		siswa.setNisn("12345");
		siswa.setAlamat("Bangkok");
		siswa.setNotelf("0823xxx");
		siswaDao.save(siswa);

		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNama("Sammi Aldhiyanto");
		mahasiswa.setNim("12345");
		mahasiswa.setAlamat("Tinggam");
		mahasiswa.setNotelf("0823xxx");
		mahasiswaDao.save(mahasiswa);

		Guru guru = new Guru();
		guru.setNama("Adisti Listianova");
		guru.setNip("12345");
		guru.setAlamat("Bangkok");
		guru.setNotelf("0823xxx");
		guruDao.save(guru);
	}

	@Test
	public void getAllTest() {
		Iterable<Mahasiswa> allMahasiswa = mahasiswaDao.findAll();
		for (Mahasiswa mahasiswa : allMahasiswa) {
			System.out.println(mahasiswa);
		}

		Iterable<Siswa> allSiswa = siswaDao.findAll();
		for (Siswa siswa : allSiswa) {
			System.out.println(siswa);
		}

		Iterable<Guru> allGuru = guruDao.findAll();
		for (Guru guru : allGuru) {
			System.out.println(guru);
		}
	}

	@Test
	void contextLoads() {
	}

}
