package N;

import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import x.C4425r;

/* loaded from: classes.dex */
public final class H0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C4425r f7697a;

    /* renamed from: b, reason: collision with root package name */
    public tf.l f7698b;

    /* renamed from: c, reason: collision with root package name */
    public Gf.i f7699c;

    /* renamed from: d, reason: collision with root package name */
    public S8.b f7700d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7701e;

    /* renamed from: f, reason: collision with root package name */
    public int f7702f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7703g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tf.a f7704h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(tf.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7704h = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        H0 h02 = new H0(this.f7704h, interfaceC3103c);
        h02.f7703g = obj;
        return h02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        ((H0) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
        return kf.a.f39711a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:43:0x0100, B:54:0x0132], limit reached: 110 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0157 A[EDGE_INSN: B:105:0x0157->B:62:0x0157 BREAK  A[LOOP:0: B:37:0x00dd->B:82:0x01ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[Catch: all -> 0x0029, TryCatch #4 {all -> 0x0029, blocks: (B:8:0x0020, B:33:0x00c5, B:36:0x00da, B:38:0x00df, B:41:0x00eb, B:43:0x0100, B:45:0x010e, B:47:0x0118, B:60:0x014a, B:63:0x0159, B:67:0x0171, B:69:0x017a, B:80:0x01a7, B:81:0x01aa, B:51:0x0129, B:55:0x0134, B:15:0x0042, B:18:0x0057, B:25:0x0095, B:29:0x00aa, B:87:0x01bb, B:88:0x01be, B:64:0x0166, B:66:0x016e, B:77:0x01a2, B:78:0x01a5, B:65:0x016a, B:26:0x009f, B:28:0x00a7, B:84:0x01b6, B:85:0x01b9), top: B:102:0x000a, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #4 {all -> 0x0029, blocks: (B:8:0x0020, B:33:0x00c5, B:36:0x00da, B:38:0x00df, B:41:0x00eb, B:43:0x0100, B:45:0x010e, B:47:0x0118, B:60:0x014a, B:63:0x0159, B:67:0x0171, B:69:0x017a, B:80:0x01a7, B:81:0x01aa, B:51:0x0129, B:55:0x0134, B:15:0x0042, B:18:0x0057, B:25:0x0095, B:29:0x00aa, B:87:0x01bb, B:88:0x01be, B:64:0x0166, B:66:0x016e, B:77:0x01a2, B:78:0x01a5, B:65:0x016a, B:26:0x009f, B:28:0x00a7, B:84:0x01b6, B:85:0x01b9), top: B:102:0x000a, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ab A[LOOP:0: B:37:0x00dd->B:82:0x01ab, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0193 -> B:74:0x0194). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.H0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
