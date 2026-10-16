package C8;

import android.content.Context;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements O9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1948c;

    public /* synthetic */ k(Context context, int i5, String str) {
        this.f1946a = i5;
        this.f1947b = context;
        this.f1948c = str;
    }

    @Override // O9.b
    public final Object get() {
        switch (this.f1946a) {
            case 0:
                return this.f1947b.getSharedPreferences(this.f1948c, 0);
            default:
                return new x9.g(this.f1947b, this.f1948c);
        }
    }
}
