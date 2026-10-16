package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class pmk implements Serializable {
    public volatile transient abow a;
    public byte[] b;

    private pmk() {
        this.b = null;
        this.a = null;
    }

    private final synchronized byte[] a() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr;
        }
        abow abowVar = this.a;
        abowVar.getClass();
        return abowVar.h();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        byte[] bArr = new byte[objectInputStream.readInt()];
        this.b = bArr;
        objectInputStream.readFully(bArr);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        byte[] bArrA = a();
        objectOutputStream.writeInt(bArrA.length);
        objectOutputStream.write(bArrA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(a(), ((pmk) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(a());
    }

    public final synchronized String toString() {
        String string;
        if (this.a == null) {
            byte[] bArr = this.b;
            bArr.getClass();
            string = Arrays.toString(bArr);
        } else {
            string = this.a.toString();
        }
        return a.bq(string, "SerializableProto{", "}");
    }

    public pmk(abow abowVar) {
        this.b = null;
        this.a = abowVar;
    }
}
