package com.google.android.gms.common.data;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.BitmapTeleporter> CREATOR = new defpackage.sjy(10);
    final int a;
    android.os.ParcelFileDescriptor b;
    final int c;
    private android.graphics.Bitmap d;
    private boolean e;
    private java.io.File f;

    public BitmapTeleporter(android.graphics.Bitmap bitmap) {
        this.a = 1;
        this.b = null;
        this.c = 0;
        this.d = bitmap;
        this.e = true;
    }

    private static final void c(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public final android.graphics.Bitmap a() {
        if (!this.e) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = this.b;
            defpackage.sqs.aA(parcelFileDescriptor);
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    android.graphics.Bitmap.Config configValueOf = android.graphics.Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    c(dataInputStream);
                    java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.d = bitmapCreateBitmap;
                    this.e = true;
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (java.lang.Throwable th) {
                c(dataInputStream);
                throw th;
            }
        }
        return this.d;
    }

    public final void b(java.io.File file) {
        if (file == null) {
            throw new java.lang.NullPointerException("Cannot set null temp directory");
        }
        this.f = file;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.b == null) {
            android.graphics.Bitmap bitmap = this.d;
            defpackage.sqs.aA(bitmap);
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            java.io.File file = this.f;
            if (file == null) {
                throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                java.io.File fileCreateTempFile = java.io.File.createTempFile("teleporter", ".tmp", file);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                    this.b = android.os.ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            c(dataOutputStream);
                        } catch (java.io.IOException e) {
                            throw new java.lang.IllegalStateException("Could not write into unlinked file", e);
                        }
                    } catch (java.lang.Throwable th) {
                        c(dataOutputStream);
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused) {
                    throw new java.lang.IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException("Could not create temporary file", e2);
            }
        }
        int iP = defpackage.sqs.p(parcel, 20293);
        defpackage.sqs.v(parcel, 1, this.a);
        defpackage.sqs.I(parcel, 2, this.b, i | 1);
        defpackage.sqs.v(parcel, 3, this.c);
        defpackage.sqs.q(parcel, iP);
        this.b = null;
    }

    public BitmapTeleporter(int i, android.os.ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
        this.d = null;
        this.e = false;
    }
}
