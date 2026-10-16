package d2;

import Q1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final h f33989a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final h f33990b = new h();

    @Override // d2.u
    public int a(Object obj) {
        String str = ((m) obj).f33992a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (x.f9724a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
