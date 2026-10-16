package androidx.security.crypto;

import android.content.Context;
import com.google.d.m.a.a.b;
import com.google.e.a.d.a.a;
import com.google.e.a.g;
import com.google.e.a.i.l;
import com.google.e.a.z;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class EncryptedFile {
    private static final String KEYSET_ALIAS = "__androidx_security_crypto_encrypted_file_keyset__";
    private static final String KEYSET_PREF_NAME = "__androidx_security_crypto_encrypted_file_pref__";
    final Context mContext;
    final File mFile;
    final String mMasterKeyAlias;
    final z mStreamingAead;

    /* compiled from: WazeSource */
    @Deprecated
    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB("AES256_GCM_HKDF_4KB");

        private final String mKeyTemplateName;

        FileEncryptionScheme(String str) {
            this.mKeyTemplateName = str;
        }

        g getKeyTemplate() {
            return b.d(this.mKeyTemplateName);
        }
    }

    EncryptedFile(File file, String str, z zVar, Context context) {
        this.mFile = file;
        this.mContext = context;
        this.mMasterKeyAlias = str;
        this.mStreamingAead = zVar;
    }

    public FileInputStream openFileInput() throws FileNotFoundException {
        boolean zExists = this.mFile.exists();
        File file = this.mFile;
        if (!zExists) {
            throw new FileNotFoundException("file doesn't exist: ".concat(String.valueOf(file.getName())));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        return new EncryptedFileInputStream(fileInputStream.getFD(), this.mStreamingAead.a(fileInputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public FileOutputStream openFileOutput() throws IOException {
        boolean zExists = this.mFile.exists();
        File file = this.mFile;
        if (zExists) {
            throw new IOException("output file already exists, please use a new file: ".concat(String.valueOf(file.getName())));
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        return new EncryptedFileOutputStream(fileOutputStream.getFD(), this.mStreamingAead.b(fileOutputStream, this.mFile.getName().getBytes(StandardCharsets.UTF_8)));
    }

    /* compiled from: WazeSource */
    final class EncryptedFileOutputStream extends FileOutputStream {
        private final OutputStream mEncryptedOutputStream;

        EncryptedFileOutputStream(FileDescriptor fileDescriptor, OutputStream outputStream) {
            super(fileDescriptor);
            this.mEncryptedOutputStream = outputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.mEncryptedOutputStream.flush();
        }

        @Override // java.io.FileOutputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(int i2) throws IOException {
            this.mEncryptedOutputStream.write(i2);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.mEncryptedOutputStream.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.mEncryptedOutputStream.write(bArr, i2, i3);
        }
    }

    /* compiled from: WazeSource */
    final class EncryptedFileInputStream extends FileInputStream implements InputStreamRetargetInterface {
        private final InputStream mEncryptedInputStream;
        private final Object mLock;

        EncryptedFileInputStream(FileDescriptor fileDescriptor, InputStream inputStream) {
            super(fileDescriptor);
            this.mLock = new Object();
            this.mEncryptedInputStream = inputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() {
            return this.mEncryptedInputStream.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mEncryptedInputStream.close();
        }

        @Override // java.io.FileInputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            synchronized (this.mLock) {
                this.mEncryptedInputStream.mark(i2);
            }
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.mEncryptedInputStream.markSupported();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() {
            return this.mEncryptedInputStream.read();
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this.mLock) {
                this.mEncryptedInputStream.reset();
            }
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public long skip(long j2) {
            return this.mEncryptedInputStream.skip(j2);
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            return this.mEncryptedInputStream.read(bArr);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            return this.mEncryptedInputStream.read(bArr, i2, i3);
        }
    }

    /* compiled from: WazeSource */
    @Deprecated
    public final class Builder {
        private static final Object sLock = new Object();
        final Context mContext;
        File mFile;
        final FileEncryptionScheme mFileEncryptionScheme;
        final String mMasterKeyAlias;
        String mKeysetPrefName = EncryptedFile.KEYSET_PREF_NAME;
        String mKeysetAlias = EncryptedFile.KEYSET_ALIAS;

        public Builder(Context context, File file, MasterKey masterKey, FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context.getApplicationContext();
            this.mMasterKeyAlias = masterKey.getKeyAlias();
        }

        public EncryptedFile build() throws GeneralSecurityException {
            com.google.e.a.d.a.b bVarB;
            l.a();
            a aVar = new a();
            aVar.e(this.mFileEncryptionScheme.getKeyTemplate());
            aVar.g(this.mContext, this.mKeysetAlias, this.mKeysetPrefName);
            aVar.f("android-keystore://".concat(String.valueOf(this.mMasterKeyAlias)));
            synchronized (sLock) {
                bVarB = aVar.b();
            }
            return new EncryptedFile(this.mFile, this.mKeysetAlias, (z) bVarB.a().i(z.class), this.mContext);
        }

        public Builder setKeysetAlias(String str) {
            this.mKeysetAlias = str;
            return this;
        }

        public Builder setKeysetPrefName(String str) {
            this.mKeysetPrefName = str;
            return this;
        }

        @Deprecated
        public Builder(File file, Context context, String str, FileEncryptionScheme fileEncryptionScheme) {
            this.mFile = file;
            this.mFileEncryptionScheme = fileEncryptionScheme;
            this.mContext = context.getApplicationContext();
            this.mMasterKeyAlias = str;
        }
    }
}
