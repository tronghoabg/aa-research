package V5;

import E5.C0465o;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import d2.C2386a;
import q2.C3860d;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler.Callback f13019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13020c;

    public /* synthetic */ a(Object obj, Handler.Callback callback, int i5) {
        this.f13018a = i5;
        this.f13020c = obj;
        this.f13019b = callback;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j8, long j10) {
        switch (this.f13018a) {
            case 0:
                ((Lc.b) this.f13020c).getClass();
                C3860d c3860d = (C3860d) this.f13019b;
                c3860d.getClass();
                if (u6.v.f46721a < 30) {
                    Handler handler = c3860d.f43988b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j8 >> 32), (int) j8));
                    break;
                } else {
                    v6.f fVar = (v6.f) c3860d.f43989c;
                    if (c3860d == fVar.f46883l1) {
                        if (j8 == Long.MAX_VALUE) {
                            fVar.f13135x0 = true;
                            break;
                        } else {
                            try {
                                fVar.o0(j8);
                                fVar.w0();
                                fVar.f13139z0.f4909f++;
                                fVar.v0();
                                fVar.X(j8);
                                break;
                            } catch (C0465o e7) {
                                fVar.f13137y0 = e7;
                                return;
                            }
                        }
                    }
                }
                break;
            case 1:
                ((Dd.c) this.f13020c).getClass();
                C3860d c3860d2 = (C3860d) this.f13019b;
                c3860d2.getClass();
                if (u6.v.f46721a < 30) {
                    Handler handler2 = c3860d2.f43988b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j8 >> 32), (int) j8));
                    break;
                } else {
                    v6.f fVar2 = (v6.f) c3860d2.f43989c;
                    if (c3860d2 == fVar2.f46883l1) {
                        if (j8 == Long.MAX_VALUE) {
                            fVar2.f13135x0 = true;
                            break;
                        } else {
                            try {
                                fVar2.o0(j8);
                                fVar2.w0();
                                fVar2.f13139z0.f4909f++;
                                fVar2.v0();
                                fVar2.X(j8);
                                break;
                            } catch (C0465o e10) {
                                fVar2.f13137y0 = e10;
                                return;
                            }
                        }
                    }
                }
                break;
            case 2:
                ((C2386a) this.f13020c).getClass();
                C3860d c3860d3 = (C3860d) this.f13019b;
                c3860d3.getClass();
                if (Q1.x.f9724a >= 30) {
                    c3860d3.a(j8);
                    break;
                } else {
                    Handler handler3 = c3860d3.f43988b;
                    handler3.sendMessageAtFrontOfQueue(Message.obtain(handler3, 0, (int) (j8 >> 32), (int) j8));
                    break;
                }
            default:
                ((X2.j) this.f13020c).getClass();
                C3860d c3860d4 = (C3860d) this.f13019b;
                c3860d4.getClass();
                if (Q1.x.f9724a >= 30) {
                    c3860d4.a(j8);
                    break;
                } else {
                    Handler handler4 = c3860d4.f43988b;
                    handler4.sendMessageAtFrontOfQueue(Message.obtain(handler4, 0, (int) (j8 >> 32), (int) j8));
                    break;
                }
        }
    }
}
