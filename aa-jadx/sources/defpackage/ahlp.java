package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahlp {
    private ahlp() {
    }

    public final defpackage.ahlq readFrom(java.io.InputStream inputStream) {
        inputStream.getClass();
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        defpackage.afia afiaVar = new defpackage.afia(1, dataInputStream.readInt());
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(afiaVar, 10));
        defpackage.afck it = afiaVar.iterator();
        while (((defpackage.afhz) it).a) {
            it.a();
            arrayList.add(java.lang.Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrBj = defpackage.afga.bj(arrayList);
        return new defpackage.ahlq(java.util.Arrays.copyOf(iArrBj, iArrBj.length));
    }

    public /* synthetic */ ahlp(defpackage.affu affuVar) {
        this();
    }
}
