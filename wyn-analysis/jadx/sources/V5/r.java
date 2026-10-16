package V5;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final r f13140b = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13141a;

    public /* synthetic */ r(int i5) {
        this.f13141a = i5;
    }

    @Override // V5.x
    public int a(Object obj) {
        n nVar = (n) obj;
        switch (this.f13141a) {
            case 1:
                String str = nVar.f13061a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (u6.v.f46721a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return nVar.f13061a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
