package Va;

import android.text.AndroidCharacter;
import android.view.Gravity;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class F extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13327c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ G f13328d;

    public /* synthetic */ F(int i5) {
        this.f13327c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        Fb fb2;
        Fb fb3;
        ISAdQualityInitError iSAdQualityInitError;
        int absoluteGravity;
        ISAdQualityInitError iSAdQualityInitError2;
        String strA;
        switch (this.f13327c) {
            case 0:
                G g9 = this.f13328d;
                G.b0(g9).clear();
                G.h0(g9).clear();
                G.Y(g9, null);
                return;
            case 1:
                G g10 = this.f13328d;
                g10.U(true);
                int i5 = G.f13355F;
                int i10 = i5 + 97;
                G.f13354E = i10 % 128;
                if (i10 % 2 != 0) {
                    fb2 = g10.f13368r;
                    int i11 = 87 / 0;
                } else {
                    fb2 = g10.f13368r;
                }
                if (fb2 != null) {
                    int i12 = i5 + 97;
                    G.f13354E = i12 % 128;
                    if (i12 % 2 != 0) {
                        fb3 = g10.f13368r;
                        int i13 = 87 / 0;
                    } else {
                        fb3 = g10.f13368r;
                    }
                    fb3.a();
                }
                Iterator it = new ArrayList(G.b0(g10)).iterator();
                while (it.hasNext()) {
                    ((X) it.next()).a();
                }
                G.b0(g10).clear();
                Iterator it2 = new ArrayList(G.h0(g10)).iterator();
                while (it2.hasNext()) {
                    ((X) it2.next()).a();
                }
                return;
            default:
                G g11 = this.f13328d;
                if (!g11.y().a().f()) {
                    int i14 = G.f13354E + 113;
                    G.f13355F = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    Eb eb2 = g11.f13371u;
                    eb2.getClass();
                    int i15 = Eb.f13324b + 95;
                    Eb.f13325c = i15 % 128;
                    int i16 = i15 % 2;
                    Kb kb2 = (Kb) eb2.f13326a.f13389h;
                    if (i16 == 0) {
                        iSAdQualityInitError2 = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                        strA = Eb.a(44819 >>> AndroidCharacter.getMirror(' '), "ꡕܷ\uf6bdꖼᕲ쐠돾抡퉱脫炥⾙齐丒㷟\uec93屈ଜ醙ꦍ᥉");
                    } else {
                        iSAdQualityInitError2 = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                        strA = Eb.a(AndroidCharacter.getMirror('0') + 44819, "ꡕܷ\uf6bdꖼᕲ쐠돾抡퉱脫炥⾙齐丒㷟\uec93屈ଜ醙ꦍ᥉");
                    }
                    Kb.x(kb2, iSAdQualityInitError2, strA.intern());
                    Eb.f13325c = (Eb.f13324b + 67) % 128;
                    return;
                }
                if (g11.O()) {
                    return;
                }
                int i17 = G.f13354E + 113;
                G.f13355F = i17 % 128;
                if (i17 % 2 == 0) {
                    throw null;
                }
                Eb eb3 = g11.f13371u;
                eb3.getClass();
                int i18 = Eb.f13325c + 81;
                Eb.f13324b = i18 % 128;
                int i19 = i18 % 2;
                Kb kb3 = (Kb) eb3.f13326a.f13389h;
                if (i19 != 0) {
                    iSAdQualityInitError = ISAdQualityInitError.CONFIG_LOAD_TIMEOUT;
                    absoluteGravity = 52883 / Gravity.getAbsoluteGravity(1, 1);
                } else {
                    iSAdQualityInitError = ISAdQualityInitError.CONFIG_LOAD_TIMEOUT;
                    absoluteGravity = 52883 - Gravity.getAbsoluteGravity(0, 0);
                }
                Kb.x(kb3, iSAdQualityInitError, Eb.a(absoluteGravity, "ꡒ曛㕼쏆鈆ꂱ缈\u0e72\udcea\ueb44맜䡪ڬ픨\ue45a늦䅈ᾷ⸣ﲔ謎婳梙❂\uf5bc萡劑憺ほ컕鵌ꮳ稔࢝쟩").intern());
                return;
        }
    }
}
