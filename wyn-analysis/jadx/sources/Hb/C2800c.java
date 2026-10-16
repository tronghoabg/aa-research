package hb;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: hb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2800c extends AbstractC2801d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f36308h;

    /* renamed from: i, reason: collision with root package name */
    public r f36309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Type[] f36310j;
    public final /* synthetic */ Type k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set f36311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set f36312m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2800c(Type type, Set set, Object obj, Method method, int i5, boolean z2, Type[] typeArr, Type type2, Set set2, Set set3, int i10) {
        super(type, set, obj, method, i5, 1, z2);
        this.f36308h = i10;
        this.f36310j = typeArr;
        this.k = type2;
        this.f36311l = set2;
        this.f36312m = set3;
    }

    @Override // hb.AbstractC2801d
    public final void a(K k, C2802e c2802e) {
        switch (this.f36308h) {
            case 0:
                super.a(k, c2802e);
                Type type = this.f36310j[0];
                Type type2 = this.k;
                boolean zB = P.b(type, type2);
                Set set = this.f36312m;
                this.f36309i = (zB && this.f36311l.equals(set)) ? k.d(c2802e, type2, set) : k.c(type2, set, null);
                break;
            default:
                super.a(k, c2802e);
                Type[] typeArr = this.f36310j;
                boolean zB2 = P.b(typeArr[0], this.k);
                Set set2 = this.f36311l;
                this.f36309i = (zB2 && set2.equals(this.f36312m)) ? k.d(c2802e, typeArr[0], set2) : k.c(typeArr[0], set2, null);
                break;
        }
    }

    @Override // hb.AbstractC2801d
    public Object b(w wVar) {
        switch (this.f36308h) {
            case 1:
                return c(this.f36309i.fromJson(wVar));
            default:
                return super.b(wVar);
        }
    }

    @Override // hb.AbstractC2801d
    public void d(AbstractC2797C abstractC2797C, Object obj) {
        switch (this.f36308h) {
            case 0:
                this.f36309i.toJson(abstractC2797C, c(obj));
                break;
            default:
                super.d(abstractC2797C, obj);
                break;
        }
    }
}
