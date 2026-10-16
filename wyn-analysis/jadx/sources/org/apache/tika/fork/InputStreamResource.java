package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
class InputStreamResource implements ForkResource {
    private final InputStream stream;

    public InputStreamResource(InputStream inputStream) {
        this.stream = inputStream;
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        int i5;
        byte[] bArr = new byte[dataInputStream.readInt()];
        try {
            i5 = this.stream.read(bArr);
        } catch (IOException e7) {
            e7.printStackTrace();
            i5 = -1;
        }
        dataOutputStream.writeInt(i5);
        if (i5 > 0) {
            dataOutputStream.write(bArr, 0, i5);
        }
        dataOutputStream.flush();
        return null;
    }
}
