package defpackage;

/* loaded from: classes.dex */
public final class xud extends xue implements xuc {
    public static final xue a = new xud(null, new aat(0)).e();
    static final xue b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        xuc xucVarB = xue.b();
        xucVarB.a(xue.e, true);
        b = ((xue) xucVarB).e();
    }

    @Override // defpackage.xuc
    public final void a(woy woyVar, Object obj) {
        woy.aa(!this.d, "Can't mutate after handing to trace");
        woy.aa(!h(woyVar), "Key already present");
        this.c.put(woyVar, obj);
    }
}
