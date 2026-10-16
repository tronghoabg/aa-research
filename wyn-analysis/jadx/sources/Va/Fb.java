package Va;

import android.os.Process;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class Fb implements X {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f13349c = {-11, -1, -2, 0, -4, 0};

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ String f13350a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Ga f13351b;

    @Override // Va.X
    public final void a() {
        String string;
        G gS = G.S();
        int iAxisFromString = MotionEvent.axisFromString("");
        int deadChar = KeyEvent.getDeadChar(0, 0);
        int i5 = (-67871959) - deadChar;
        int deadChar2 = KeyEvent.getDeadChar(0, 0);
        byte pressedStateDuration = (byte) (ViewConfiguration.getPressedStateDuration() >> 16);
        short s10 = (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i10 = deadChar2 + 6;
                int i11 = i10 == -1 ? 1 : 0;
                if (i11 != 0) {
                    i10 = (byte) (f13349c[0 - deadChar] + 20);
                }
                if (i10 > 0) {
                    AbstractC1104pb.f14486F = ((i5 + i10) - (-67871957)) + i11;
                    AbstractC1104pb.f14487G = pressedStateDuration;
                    char c10 = (char) (iAxisFromString + 116);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i10) {
                        byte[] bArr = f13349c;
                        int i12 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i12 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i12] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gS.V(string.intern(), this.f13350a)) {
            return;
        }
        Kb kb2 = (Kb) this.f13351b.f13389h;
        int i13 = Kb.f13490x + 27;
        Kb.f13489w = i13 % 128;
        if (i13 % 2 != 0) {
            kb2.s(false);
        } else {
            kb2.s(true);
        }
    }
}
