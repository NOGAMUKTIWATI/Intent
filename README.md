# Intent
<p>Intent
Intent adalah sebuah kelas dalam programming Android yang berfungsi untuk perpindahan 
halaman dan juga mekanisme untuk melakukan sebuah action dan komunikasi antar 
komponen aplikasi misal activity, services, dan broadcast receiver. Intent juga merupakan 
suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi 
dengan activity yang lain, baik activity pada fungsi internal android misal seperti 
memanggil activity dalam satu package atau beda package yang masih berada dalam satu 
project.
Terdapat tiga penggunaan umum intent dalam aplikasi Android yaitu: Memindahkan satu 
activity ke activity lain dengan atau tidak membawa data. Menjalankan background 
service, misalnya melakukan sinkronisasi ke server dan menjalankan proses berulang 
(periodic/scheduler task). Mengirimkan obyek broadcast ke aplikasi yang membutuhkan. 
Misal, ketika aplikasi membutuhkan proses menjalankan sebuah background service setiap 
kali aplikasi selesai melakukan booting. Aplikasi harus bisa menerima obyek broadcast 
yang dikirimkan oleh sistem Android untuk event booting tersebut.
Intent merupakan objek tipe android.content.Intent. Melalui metode startActivity() yang 
digunakan untuk memulai sebuah activity lain. 
<h1>Intent Implicit<h1>
  

![Intent Imp](https://user-images.githubusercontent.com/80508180/137124543-5905dd6c-dc76-4fa1-b67f-572ae324bba9.jpeg)
  <br>
![url](https://user-images.githubusercontent.com/80508180/137124554-b402f734-95f0-4a2e-be44-d74d2d00db6c.jpeg)

