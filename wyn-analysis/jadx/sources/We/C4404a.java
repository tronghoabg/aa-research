package we;

import C8.i;
import a2.v;
import android.content.SharedPreferences;
import ee.EnumC2512a;
import kotlin.jvm.internal.AbstractC3343n;
import re.C3980d;

/* renamed from: we.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4404a extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f47482i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f47483j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4404a(i iVar, int i5) {
        super(0);
        this.f47482i = i5;
        this.f47483j = iVar;
    }

    @Override // tf.a
    public final Object invoke() {
        i iVar = this.f47483j;
        switch (this.f47482i) {
            case 0:
                v vVar = (v) iVar.f1939b;
                EnumC2512a[] enumC2512aArr = EnumC2512a.f34651a;
                String string = ((SharedPreferences) vVar.f17322b).getString("source", "android");
                return string == null ? "android" : string;
            default:
                v vVar2 = (v) iVar.f1939b;
                EnumC2512a[] enumC2512aArr2 = EnumC2512a.f34651a;
                i iVar2 = (i) iVar.f1941d;
                String string2 = ((SharedPreferences) vVar2.f17322b).getString("sourceVersion", ((C3980d) iVar2.f1939b).f44809b);
                return string2 == null ? ((C3980d) iVar2.f1939b).f44809b : string2;
        }
    }
}
