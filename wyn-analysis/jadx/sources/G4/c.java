package G4;

import A5.n;
import Q1.w;
import android.content.Context;
import com.applovin.shadow.okio.Segment;
import df.InterfaceC2432a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;
import r9.RunnableC3954k;
import t5.AbstractC4118m;
import t5.C4115j;
import t5.C4119n;
import t5.C4124s;
import v5.C4300a;
import y1.InterfaceC4525f;
import z5.i;

/* loaded from: classes.dex */
public final class c implements InterfaceC4525f {

    /* renamed from: a, reason: collision with root package name */
    public Context f4226a;

    public /* synthetic */ c(Context context, byte b5) {
        this.f4226a = context;
    }

    @Override // y1.InterfaceC4525f
    public void a(tg.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new w("EmojiCompatInitializer", 2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC3954k(this, bVar, threadPoolExecutor, 3));
    }

    public String b(String str) {
        InputStream inputStreamOpen = this.f4226a.getAssets().open(str);
        AbstractC3340k.d(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Bf.a.f1670a), Segment.SIZE);
        try {
            String strC = Fe.c.C(bufferedReader);
            bufferedReader.close();
            return strC;
        } finally {
        }
    }

    public C4115j c() {
        Context context = this.f4226a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C4115j c4115j = new C4115j();
        c4115j.f45779a = C4300a.a(AbstractC4118m.f45787a);
        A5.e eVar = new A5.e(context, 3);
        c4115j.f45780b = eVar;
        c4115j.f45781c = C4300a.a(new n(eVar, new A5.e(eVar, 2), 1));
        A5.e eVar2 = c4115j.f45780b;
        c4115j.f45782d = new A5.e(eVar2, 1);
        InterfaceC2432a interfaceC2432aA = C4300a.a(new n(c4115j.f45782d, C4300a.a(new A5.e(eVar2, 0)), 0));
        c4115j.f45783e = interfaceC2432aA;
        C4119n c4119n = new C4119n(1);
        A5.e eVar3 = c4115j.f45780b;
        C4124s c4124s = new C4124s(eVar3, interfaceC2432aA, c4119n, 1);
        InterfaceC2432a interfaceC2432a = c4115j.f45779a;
        InterfaceC2432a interfaceC2432a2 = c4115j.f45781c;
        c4115j.f45784f = C4300a.a(new C4124s(new y5.b(interfaceC2432a, interfaceC2432a2, c4124s, interfaceC2432aA, interfaceC2432aA), new z5.g(eVar3, interfaceC2432a2, interfaceC2432aA, c4124s, interfaceC2432a, interfaceC2432aA, interfaceC2432aA), new i(interfaceC2432a, interfaceC2432aA, c4124s, interfaceC2432aA), 0));
        return c4115j;
    }

    public c(Context context, int i5) {
        switch (i5) {
            case 5:
                this.f4226a = context.getApplicationContext();
                break;
            default:
                this.f4226a = context.getApplicationContext();
                break;
        }
    }
}
