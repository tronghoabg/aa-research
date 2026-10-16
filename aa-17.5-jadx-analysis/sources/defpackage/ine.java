package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.car.CarInfo;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.stream.Stream;
import java.text.SimpleDateFormat;
import java.util.BitSet;
import java.util.Date;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
public abstract class ine extends rbj {
    public static final /* synthetic */ int g = 0;
    private static final yfy h;
    private static BitSet i;
    protected final inc a;
    final ind b;
    final Queue c;
    public final Object d;
    public final String e;
    protected final ComponentName f;
    private final yfy j;
    private final yz k;
    private final boolean l;
    private long m;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(0, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_SETUP);
        yfuVar.e(2, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_START);
        yfuVar.e(5, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_STOP);
        yfuVar.e(7, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_RESUME);
        yfuVar.e(9, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_VIDEO_CONFIG_CHANGE);
        yfuVar.e(11, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_PAUSE);
        yfuVar.e(13, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_ON_NEW_INTENT);
        yfuVar.e(15, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_PRE_FINISH);
        yfuVar.e(18, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_RELINQUISH_VIDEO_FOCUS);
        yfuVar.e(19, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_REQUEST_VIDEO_FOCUS);
        yfuVar.e(20, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_FOCUS_CHANGE);
        yfuVar.e(22, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_START_INPUT);
        yfuVar.e(23, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_STOP_INPUT);
        yfuVar.e(24, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_ON_STOP_IME_INPUT);
        yfuVar.e(26, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_EVENT);
        yfuVar.e(27, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_ON_WINDOW_REATTACH);
        yfuVar.e(49, tfj.GEARHEAD_CAR_ACTIVITY_MANAGER_LIFETIME);
        h = yfuVar.d(true);
        i = null;
    }

    public ine(ing ingVar, ComponentName componentName) {
        super(ingVar, Looper.getMainLooper());
        acny acnyVar = acny.a;
        Stream stream = Collection.EL.stream(acnyVar.gu().b().b);
        ilq ilqVar = new ilq(3);
        yfy yfyVar = h;
        yfyVar.getClass();
        this.j = (yfy) stream.collect(ycm.a(ilqVar, new ixx(yfyVar, 1)));
        this.k = new yz();
        this.b = new ind(this, -1);
        this.c = new ConcurrentLinkedQueue();
        this.d = new Object();
        this.f = componentName;
        String strE = ing.e(componentName);
        this.e = strE;
        this.l = Collection.EL.stream(acnyVar.gu().d().b).map(new ilq(2)).anyMatch(new imb(componentName, 2));
        CarInfo carInfoT = ingVar.b.f.t();
        abru abruVarC = acnyVar.gu().c();
        inc incVar = null;
        if ((abruVarC.b.isEmpty() || (carInfoT != null && jfr.d(carInfoT.a, carInfoT.b, carInfoT.c, null, null, (ygr) tgx.d(new ilq(15), abruVarC).collect(ycm.b)))) && componentName.equals(inh.a)) {
            incVar = new inc(inh.i, inh.j, inh.k, strE);
        }
        this.a = incVar;
    }

    protected abstract int a(int i2);

    protected abstract String b(int i2);

    protected abstract String c(Message message);

    public final void d(int i2) {
        e(Message.obtain(this, i2));
    }

    public final void e(Message message) {
        synchronized (this.d) {
            Queue queue = this.c;
            boolean zIsEmpty = queue.isEmpty();
            queue.add(message);
            if (zIsEmpty) {
                this.m = SystemClock.elapsedRealtime();
                sendMessage(Message.obtain(message));
                o(message.what);
            }
        }
    }

    protected void f() {
        throw null;
    }

    protected final void g(int i2, boolean z) {
        rbr.d(this, this.b);
        l(i2, z);
    }

    public final void h() {
        synchronized (this.d) {
            this.c.clear();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strB;
        ilb.d();
        ing ingVar = (ing) v();
        if (ingVar == null) {
            return;
        }
        String strC = c(message);
        if (strC != null) {
            strB = b(message.what) + " " + strC;
        } else {
            strB = b(message.what);
        }
        ((ype) ing.a.l().ai(600)).R("handleMessage component:%s command:%s args:%s", this.e, new zjd(zjc.a, b(message.what)), strC);
        yz yzVar = this.k;
        synchronized (yzVar) {
            if (yzVar.a() == 10) {
                int i2 = yzVar.b;
                if (i2 == yzVar.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = yzVar.a;
                Object obj = objArr[i2];
                objArr[i2] = null;
                yzVar.b = (i2 + 1) & yzVar.d;
            }
            Pair pair = new Pair(Long.valueOf(System.currentTimeMillis()), strB);
            Object[] objArr2 = yzVar.a;
            int i3 = yzVar.c;
            objArr2[i3] = pair;
            int i4 = yzVar.d & (i3 + 1);
            yzVar.c = i4;
            int i5 = yzVar.b;
            if (i4 == i5) {
                int length = objArr2.length;
                int i6 = length - i5;
                int i7 = length + length;
                if (i7 < 0) {
                    throw new RuntimeException("Max array capacity exceeded");
                }
                Object[] objArr3 = new Object[i7];
                objArr2.getClass();
                System.arraycopy(objArr2, i5, objArr3, 0, i6);
                Object[] objArr4 = yzVar.a;
                int i8 = yzVar.b;
                objArr4.getClass();
                System.arraycopy(objArr4, 0, objArr3, i6, i8);
                yzVar.a = objArr3;
                yzVar.b = 0;
                yzVar.c = length;
                yzVar.d = i7 - 1;
            }
        }
        m(ingVar, message);
    }

    public final void i(int i2, boolean z) {
        synchronized (this.d) {
            g(i2, z);
            inc incVar = this.a;
            if (incVar != null) {
                incVar.b(i2, z);
            }
            Queue queue = this.c;
            Message message = (Message) queue.peek();
            if (message == null || message.what != i2) {
                ((ype) ((ype) ing.a.h()).ai(598)).R("Ignoring unexpected message completion in %s: head %s; got %d", this.f.toShortString(), message, Integer.valueOf(i2));
            } else {
                queue.remove();
                int i3 = true != z ? 3 : 2;
                if (this.l) {
                    int i4 = message.what;
                    if (i == null) {
                        i = new BitSet();
                        Iterator<E> it = acny.b().b.iterator();
                        while (it.hasNext()) {
                            i.set(((Integer) it.next()).intValue());
                        }
                    }
                    if (i.get(i4)) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        abnp abnpVarN = yxh.a.n();
                        int i5 = message.what;
                        abnpVarN.t();
                        yxh yxhVar = (yxh) abnpVarN.b;
                        yxhVar.b |= 4;
                        yxhVar.e = i5;
                        abnpVarN.t();
                        yxh yxhVar2 = (yxh) abnpVarN.b;
                        yxhVar2.b |= 16;
                        yxhVar2.g = i3 - 1;
                        int i6 = message.arg1;
                        abnpVarN.t();
                        yxh yxhVar3 = (yxh) abnpVarN.b;
                        yxhVar3.b |= 64;
                        yxhVar3.i = i6;
                        int i7 = message.arg2;
                        abnpVarN.t();
                        yxh yxhVar4 = (yxh) abnpVarN.b;
                        yxhVar4.b |= 128;
                        yxhVar4.j = i7;
                        long j = this.m;
                        if (jElapsedRealtime >= j) {
                            abnpVarN.t();
                            yxh yxhVar5 = (yxh) abnpVarN.b;
                            yxhVar5.b |= 8;
                            yxhVar5.f = (int) (jElapsedRealtime - j);
                        } else {
                            ((ype) ing.a.l().ai(607)).G("Unexpected command start time: %d End time: %d", this.m, jElapsedRealtime);
                        }
                        if (v() != null) {
                            ing ingVar = (ing) v();
                            String strFlattenToShortString = ingVar.d.flattenToShortString();
                            abnpVarN.t();
                            yxh yxhVar6 = (yxh) abnpVarN.b;
                            strFlattenToShortString.getClass();
                            yxhVar6.b = 1 | yxhVar6.b;
                            yxhVar6.c = strFlattenToShortString;
                            int iA = ingVar.a();
                            abnpVarN.t();
                            yxh yxhVar7 = (yxh) abnpVarN.b;
                            yxhVar7.b = 2 | yxhVar7.b;
                            yxhVar7.d = iA;
                            String strF = ingVar.f();
                            abnpVarN.t();
                            yxh yxhVar8 = (yxh) abnpVarN.b;
                            strF.getClass();
                            yxhVar8.b |= 32;
                            yxhVar8.h = strF;
                            yxh yxhVar9 = (yxh) abnpVarN.q();
                            Handler handler = ingVar.B;
                            if (handler != null) {
                                handler.post(new hhw(ingVar, yxhVar9, 20, (char[]) null));
                            } else {
                                ingVar.b.e.a(yxhVar9);
                            }
                        }
                    }
                }
                message.recycle();
                if (!queue.isEmpty()) {
                    Message messageObtain = Message.obtain((Message) queue.peek());
                    this.m = SystemClock.elapsedRealtime();
                    sendMessage(messageObtain);
                    o(messageObtain.what);
                }
            }
        }
    }

    public final void j(int i2, int i3) {
        p(i2, Message.obtain(this, i3));
    }

    protected final void k(int i2, int i3, Throwable th) {
        if (i3 == 1) {
            ((ype) ing.a.l().ai(606)).M("%s: Command %s in flight", this.e, new zjd(zjc.a, b(i2)));
            return;
        }
        if (th != null) {
            ((ype) ((ype) ing.a.g()).ai(605)).K("component: %s; Exception calling %d", this.e, i2);
            ((ing) v()).m(new RuntimeException("Command " + b(i2) + " failed in " + this.f.flattenToShortString()));
            return;
        }
        if (i3 == 3) {
            ((ype) ing.a.l().ai(604)).M("%s %s Command unsuccessful", this.e, new zjd(zjc.a, b(i2)));
            i(i2, false);
            return;
        }
        if (i3 == 2) {
            yph yphVar = ing.a;
            b(i2);
            i(i2, true);
        } else {
            if (i3 != 4) {
                ((ype) ((ype) ing.a.g()).ai((char) 601)).y("Unknown result for command %s", new zjd(zjc.a, b(i2)));
                i(i2, false);
                return;
            }
            ((ype) ing.a.l().ai(602)).M("%s: Command %s delayed", this.e, new zjd(zjc.a, b(i2)));
            g(i2, true);
        }
    }

    public final void l(int i2, boolean z) {
        tfj tfjVar = (tfj) this.j.get(Integer.valueOf(i2));
        if (tfjVar != null) {
            tfk.a.d(tfjVar, true != z ? 2 : 1);
        }
    }

    protected abstract void m(ing ingVar, Message message);

    public final void n() {
        h();
        f();
    }

    public final void o(int i2) {
        ind indVar = this.b;
        indVar.a = i2;
        if (i2 == 2) {
            xya xyaVar = indVar.b;
            xyaVar.d();
            xyaVar.e();
            i2 = 2;
        }
        tfj tfjVar = (tfj) this.j.get(Integer.valueOf(i2));
        if (tfjVar != null) {
            tfk.a.b(tfjVar);
        }
        inc incVar = this.a;
        if (incVar != null) {
            incVar.a(i2);
        }
        rbr.c(this, indVar, a(i2));
    }

    protected final void p(int i2, Message message) {
        synchronized (this.d) {
            Message message2 = (Message) this.c.peek();
            if (message2 == null || message2.what != i2) {
                ype ypeVar = (ype) ((ype) ing.a.h()).ai(599);
                String str = this.e;
                String strB = message2 != null ? b(message2.what) : "null";
                zjc zjcVar = zjc.a;
                ypeVar.S("Ignoring unexpected message continuation in %s: head %s; got %s %s", str, new zjd(zjcVar, strB), new zjd(zjcVar, b(message.what)), c(message));
            } else {
                inc incVar = this.a;
                if (incVar != null) {
                    incVar.c(i2, message.what);
                }
                sendMessage(message);
            }
        }
    }

    @Override // android.os.Handler
    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder("CMH{[");
        Iterator it = this.c.iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Message message = (Message) it.next();
            sb.append(true != z ? " (" : "(");
            sb.append(message.what);
            if (message.arg1 != 0) {
                sb.append(" ");
                sb.append(message.arg1);
            }
            if (message.arg2 != 0) {
                sb.append(" ");
                sb.append(message.arg2);
            }
            if (message.obj != null) {
                sb.append(" ");
                sb.append(message.obj);
            }
            sb.append(")");
            z = false;
        }
        sb.append("]} Command History: \n");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        yz yzVar = this.k;
        synchronized (yzVar) {
            for (i2 = 0; i2 < yzVar.a(); i2++) {
                if (i2 >= yzVar.a()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object obj = yzVar.a[(yzVar.b + i2) & yzVar.d];
                obj.getClass();
                Pair pair = (Pair) obj;
                sb.append("  ");
                sb.append(simpleDateFormat.format(new Date(((Long) pair.first).longValue())));
                sb.append(" : ");
                sb.append((String) pair.second);
                if (i2 < yzVar.a()) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
