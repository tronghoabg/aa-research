package X;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;

/* loaded from: classes.dex */
public final class j extends AbstractC3470i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int[] f15704a;

    /* renamed from: b, reason: collision with root package name */
    public int f15705b;

    /* renamed from: c, reason: collision with root package name */
    public int f15706c;

    /* renamed from: d, reason: collision with root package name */
    public int f15707d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f15709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f15709f = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        j jVar = new j(this.f15709f, interfaceC3103c);
        jVar.f15708e = obj;
        return jVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((Af.m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:26:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:36:0x00c1). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
