package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afdc implements java.io.Externalizable {
    private static final long serialVersionUID = 0;
    private java.util.Collection a;
    private final int b;

    public afdc(java.util.Collection collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final java.lang.Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.InvalidObjectException {
        java.util.Collection collectionF;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new java.io.InvalidObjectException(defpackage.a.bm(b, "Unsupported flags value: ", "."));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new java.io.InvalidObjectException(defpackage.a.bm(i2, "Illegal size value: ", "."));
        }
        int i3 = 0;
        if (i != 0) {
            defpackage.afde afdeVar = new defpackage.afde(new defpackage.afcy(i2));
            while (i3 < i2) {
                afdeVar.add(objectInput.readObject());
                i3++;
            }
            collectionF = defpackage.afga.H(afdeVar);
        } else {
            defpackage.afct afctVar = new defpackage.afct(i2);
            while (i3 < i2) {
                afctVar.add(objectInput.readObject());
                i3++;
            }
            collectionF = afctVar.f();
        }
        this.a = collectionF;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public afdc() {
        this(defpackage.afce.a, 0);
    }
}
