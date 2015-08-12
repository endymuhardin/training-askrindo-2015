# Training Askrindo 2015 #

## Contoh Aplikasi ##

* Aplikasi Absensi

## Konsep Penting ##

### Classpath ###

* tempat dimana Java Runtime mencari class yang ingin digunakan
* konsep ini juga ada di bahasa pemrograman lain

    * PHP : `include_path`
    * Ruby : `LOAD_PATH`
    * Python : `PYTHONPATH` atau `sys.path`
    * DLL : Windows Registry

* Cara setting CLASSPATH

    * opsi command line `-cp`
    
        ```
        java -cp folder/lokasi/class/file Halo
        ```
    
    * menggunakan environment variable bernama `CLASSPATH`

* Cara setting Environment Variable **(jangan dilakukan !!!)**

    * inline di command line, cuma berlaku satu kali eksekusi
    
        ```
        CLASSPATH=folder/lokasi/class/file java Halo
        ```
    
    * pasang variabel di command line, berlaku hingga command prompt ditutup
    
        * *Nix
        
        ```
        export CLASSPATH=folder/lokasi/class/file
        ```
        
        * Windows
        
        ```
        set CLASSPATH=folder\lokasi\class\file
        ```
     
     * Setting di OS (satu user)
     
        * Linux : edit `$HOME/.bashrc`
        * Windows : Klik kanan My Computer > Properties > Advanced > Env Variable > User Variable
        
     * Setting di OS (semua user)
     
        * Linux : edit `/etc/environment`
        * Windows : Klik kanan My Computer > Properties > Advanced > Env Variable > System Variable

* Setting CLASSPATH bisa juga dilakukan oleh tools atau aplikasi yang kita gunakan. Contoh:

    * Maven : semua jar yang kita sebutkan di dependency, otomatis didaftarkan menjadi CLASSPATH
    * IDE (Netbeans / Eclipse) : semua folder hasil compile, library yang didaftarkan, source folder, otomatis didaftarkan menjadi CLASSPATH
    * Aplikasi Web Java : semua jar dalam folder `WEB-INF/lib` dan folder `WEB-INF/classes` akan didaftarkan menjadi CLASSPATH

* Selain berisi class (program Java), CLASSPATH juga biasa kita isi dengan resources/asset (misal: gambar, suara, template report, konfigurasi, dsb)


    
    
     
