package Va;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Q7 implements InterfaceC1180va {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ ArrayList f13625a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C1126r8 f13626b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ C1203x8 f13627c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ C1214y7 f13628d;

    @Override // Va.InterfaceC1180va
    public final void a() {
        ArrayList arrayList = this.f13625a;
        arrayList.add(0, this);
        this.f13626b.c(this.f13627c, this.f13628d, arrayList);
        arrayList.remove(0);
    }
}
