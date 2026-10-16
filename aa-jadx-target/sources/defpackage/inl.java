package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class inl extends defpackage.rce {
    public static final /* synthetic */ int g = 0;
    private static final defpackage.yhe h;
    private static java.util.BitSet i;
    protected final inj a;
    final defpackage.ink b;
    final java.util.Queue c;
    public final java.lang.Object d;
    public final java.lang.String e;
    protected final android.content.ComponentName f;
    private final defpackage.yhe j;
    private final defpackage.zg k;
    private final boolean l;
    private long m;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(0, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_SETUP);
        yhaVar.f(2, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_START);
        yhaVar.f(5, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_STOP);
        yhaVar.f(7, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_RESUME);
        yhaVar.f(9, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_VIDEO_CONFIG_CHANGE);
        yhaVar.f(11, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_PAUSE);
        yhaVar.f(13, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_ON_NEW_INTENT);
        yhaVar.f(15, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_PRE_FINISH);
        yhaVar.f(18, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_RELINQUISH_VIDEO_FOCUS);
        yhaVar.f(19, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_REQUEST_VIDEO_FOCUS);
        yhaVar.f(20, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_FOCUS_CHANGE);
        yhaVar.f(22, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_START_INPUT);
        yhaVar.f(23, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_STOP_INPUT);
        yhaVar.f(24, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_ON_STOP_IME_INPUT);
        yhaVar.f(26, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_INPUT_EVENT);
        yhaVar.f(27, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_ON_WINDOW_REATTACH);
        yhaVar.f(49, defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_LIFETIME);
        h = yhaVar.d(true);
        i = null;
    }

    public inl(defpackage.inn innVar, android.content.ComponentName componentName) {
        super(innVar, android.os.Looper.getMainLooper());
        defpackage.acpa acpaVar = defpackage.acpa.a;
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(acpaVar.fF().b().b);
        defpackage.ilz ilzVar = new defpackage.ilz(3);
        defpackage.yhe yheVar = h;
        yheVar.getClass();
        this.j = (defpackage.yhe) stream.collect(defpackage.yds.a(ilzVar, new defpackage.kpc(yheVar, 1)));
        this.k = new defpackage.zg();
        this.b = new defpackage.ink(this, -1);
        this.c = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.d = new java.lang.Object();
        this.f = componentName;
        java.lang.String strE = defpackage.inn.e(componentName);
        this.e = strE;
        this.l = j$.util.Collection.-EL.stream(acpaVar.fF().d().b).map(new defpackage.ilz(2)).anyMatch(new defpackage.imj(componentName, 2));
        com.google.android.gms.car.CarInfo carInfoT = innVar.b.f.t();
        defpackage.absx absxVarC = acpaVar.fF().c();
        inj injVar = null;
        if ((absxVarC.b.isEmpty() || (carInfoT != null && defpackage.jfz.d(carInfoT.a, carInfoT.b, carInfoT.c, null, null, (defpackage.yhx) defpackage.tht.d(new defpackage.ilz(14), absxVarC).collect(defpackage.yds.b)))) && componentName.equals(defpackage.ino.a)) {
            injVar = new inj(defpackage.ino.i, defpackage.ino.j, defpackage.ino.k, strE);
        }
        this.a = injVar;
    }

    protected abstract int a(int i2);

    protected abstract java.lang.String b(int i2);

    protected abstract java.lang.String c(android.os.Message message);

    public final void d(int i2) {
        e(android.os.Message.obtain(this, i2));
    }

    public final void e(android.os.Message message) {
        synchronized (this.d) {
            java.util.Queue queue = this.c;
            boolean zIsEmpty = queue.isEmpty();
            queue.add(message);
            if (zIsEmpty) {
                this.m = android.os.SystemClock.elapsedRealtime();
                sendMessage(android.os.Message.obtain(message));
                o(message.what);
            }
        }
    }

    protected void f() {
        throw null;
    }

    protected final void g(int i2, boolean z) {
        defpackage.rcm.d(this, this.b);
        l(i2, z);
    }

    public final void h() {
        synchronized (this.d) {
            this.c.clear();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.String strB;
        defpackage.ill.d();
        defpackage.inn innVar = (defpackage.inn) v();
        if (innVar == null) {
            return;
        }
        java.lang.String strC = c(message);
        if (strC != null) {
            strB = b(message.what) + " " + strC;
        } else {
            strB = b(message.what);
        }
        ((defpackage.yqj) defpackage.inn.a.l().ai(600)).R("handleMessage component:%s command:%s args:%s", this.e, new defpackage.zkf(defpackage.zke.a, b(message.what)), strC);
        defpackage.zg zgVar = this.k;
        synchronized (zgVar) {
            if (zgVar.a() == 10) {
                int i2 = zgVar.b;
                if (i2 == zgVar.c) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                java.lang.Object[] objArr = zgVar.a;
                java.lang.Object obj = objArr[i2];
                objArr[i2] = null;
                zgVar.b = (i2 + 1) & zgVar.d;
            }
            android.util.Pair pair = new android.util.Pair(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), strB);
            java.lang.Object[] objArr2 = zgVar.a;
            int i3 = zgVar.c;
            objArr2[i3] = pair;
            int i4 = zgVar.d & (i3 + 1);
            zgVar.c = i4;
            int i5 = zgVar.b;
            if (i4 == i5) {
                int length = objArr2.length;
                int i6 = length - i5;
                int i7 = length + length;
                if (i7 < 0) {
                    throw new java.lang.RuntimeException("Max array capacity exceeded");
                }
                java.lang.Object[] objArr3 = new java.lang.Object[i7];
                objArr2.getClass();
                java.lang.System.arraycopy(objArr2, i5, objArr3, 0, i6);
                java.lang.Object[] objArr4 = zgVar.a;
                int i8 = zgVar.b;
                objArr4.getClass();
                java.lang.System.arraycopy(objArr4, 0, objArr3, i6, i8);
                zgVar.a = objArr3;
                zgVar.b = 0;
                zgVar.c = length;
                zgVar.d = i7 - 1;
            }
        }
        m(innVar, message);
    }

    public final void i(int i2, boolean z) {
        synchronized (this.d) {
            g(i2, z);
            inj injVar = this.a;
            if (injVar != null) {
                injVar.b(i2, z);
            }
            java.util.Queue queue = this.c;
            android.os.Message message = (android.os.Message) queue.peek();
            if (message == null || message.what != i2) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.h()).ai(598)).R("Ignoring unexpected message completion in %s: head %s; got %d", this.f.toShortString(), message, java.lang.Integer.valueOf(i2));
            } else {
                queue.remove();
                int i3 = true != z ? 3 : 2;
                if (this.l) {
                    int i4 = message.what;
                    if (i == null) {
                        i = new java.util.BitSet();
                        java.util.Iterator<E> it = defpackage.acpa.b().b.iterator();
                        while (it.hasNext()) {
                            i.set(((java.lang.Integer) it.next()).intValue());
                        }
                    }
                    if (i.get(i4)) {
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        defpackage.abor aborVarN = defpackage.yym.a.n();
                        int i5 = message.what;
                        aborVarN.t();
                        defpackage.yym yymVar = (defpackage.yym) aborVarN.b;
                        yymVar.b |= 4;
                        yymVar.e = i5;
                        aborVarN.t();
                        defpackage.yym yymVar2 = (defpackage.yym) aborVarN.b;
                        yymVar2.b |= 16;
                        yymVar2.g = i3 - 1;
                        int i6 = message.arg1;
                        aborVarN.t();
                        defpackage.yym yymVar3 = (defpackage.yym) aborVarN.b;
                        yymVar3.b |= 64;
                        yymVar3.i = i6;
                        int i7 = message.arg2;
                        aborVarN.t();
                        defpackage.yym yymVar4 = (defpackage.yym) aborVarN.b;
                        yymVar4.b |= 128;
                        yymVar4.j = i7;
                        long j = this.m;
                        if (jElapsedRealtime >= j) {
                            aborVarN.t();
                            defpackage.yym yymVar5 = (defpackage.yym) aborVarN.b;
                            yymVar5.b |= 8;
                            yymVar5.f = (int) (jElapsedRealtime - j);
                        } else {
                            ((defpackage.yqj) defpackage.inn.a.l().ai(607)).G("Unexpected command start time: %d End time: %d", this.m, jElapsedRealtime);
                        }
                        if (v() != null) {
                            defpackage.inn innVar = (defpackage.inn) v();
                            java.lang.String strFlattenToShortString = innVar.d.flattenToShortString();
                            aborVarN.t();
                            defpackage.yym yymVar6 = (defpackage.yym) aborVarN.b;
                            strFlattenToShortString.getClass();
                            yymVar6.b |= 1;
                            yymVar6.c = strFlattenToShortString;
                            int iA = innVar.a();
                            aborVarN.t();
                            defpackage.yym yymVar7 = (defpackage.yym) aborVarN.b;
                            yymVar7.b = 2 | yymVar7.b;
                            yymVar7.d = iA;
                            java.lang.String strF = innVar.f();
                            aborVarN.t();
                            defpackage.yym yymVar8 = (defpackage.yym) aborVarN.b;
                            strF.getClass();
                            yymVar8.b |= 32;
                            yymVar8.h = strF;
                            defpackage.yym yymVar9 = (defpackage.yym) aborVarN.q();
                            android.os.Handler handler = innVar.B;
                            if (handler != null) {
                                handler.post(new defpackage.inq(innVar, yymVar9, 1));
                            } else {
                                innVar.b.e.a(yymVar9);
                            }
                        }
                    }
                }
                message.recycle();
                if (!queue.isEmpty()) {
                    android.os.Message messageObtain = android.os.Message.obtain((android.os.Message) queue.peek());
                    this.m = android.os.SystemClock.elapsedRealtime();
                    sendMessage(messageObtain);
                    o(messageObtain.what);
                }
            }
        }
    }

    public final void j(int i2, int i3) {
        p(i2, android.os.Message.obtain(this, i3));
    }

    protected final void k(int i2, int i3, java.lang.Throwable th) {
        if (i3 == 1) {
            ((defpackage.yqj) defpackage.inn.a.l().ai(606)).M("%s: Command %s in flight", this.e, new defpackage.zkf(defpackage.zke.a, b(i2)));
            return;
        }
        if (th != null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.g()).ai(605)).K("component: %s; Exception calling %d", this.e, i2);
            ((defpackage.inn) v()).m(new java.lang.RuntimeException("Command " + b(i2) + " failed in " + this.f.flattenToShortString()));
            return;
        }
        if (i3 == 3) {
            ((defpackage.yqj) defpackage.inn.a.l().ai(604)).M("%s %s Command unsuccessful", this.e, new defpackage.zkf(defpackage.zke.a, b(i2)));
            i(i2, false);
            return;
        }
        if (i3 == 2) {
            defpackage.yqm yqmVar = defpackage.inn.a;
            b(i2);
            i(i2, true);
        } else {
            if (i3 != 4) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.g()).ai((char) 601)).y("Unknown result for command %s", new defpackage.zkf(defpackage.zke.a, b(i2)));
                i(i2, false);
                return;
            }
            ((defpackage.yqj) defpackage.inn.a.l().ai(602)).M("%s: Command %s delayed", this.e, new defpackage.zkf(defpackage.zke.a, b(i2)));
            g(i2, true);
        }
    }

    public final void l(int i2, boolean z) {
        defpackage.tgf tgfVar = (defpackage.tgf) this.j.get(java.lang.Integer.valueOf(i2));
        if (tgfVar != null) {
            defpackage.tgg.a.d(tgfVar, true != z ? 2 : 1);
        }
    }

    protected abstract void m(defpackage.inn innVar, android.os.Message message);

    public final void n() {
        h();
        f();
    }

    public final void o(int i2) {
        defpackage.ink inkVar = this.b;
        inkVar.a = i2;
        if (i2 == 2) {
            defpackage.xzg xzgVar = inkVar.b;
            xzgVar.d();
            xzgVar.e();
            i2 = 2;
        }
        defpackage.tgf tgfVar = (defpackage.tgf) this.j.get(java.lang.Integer.valueOf(i2));
        if (tgfVar != null) {
            defpackage.tgg.a.b(tgfVar);
        }
        inj injVar = this.a;
        if (injVar != null) {
            injVar.a(i2);
        }
        defpackage.rcm.c(this, inkVar, a(i2));
    }

    protected final void p(int i2, android.os.Message message) {
        synchronized (this.d) {
            android.os.Message message2 = (android.os.Message) this.c.peek();
            if (message2 == null || message2.what != i2) {
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.h()).ai(599);
                java.lang.String str = this.e;
                java.lang.String strB = message2 != null ? b(message2.what) : "null";
                defpackage.zke zkeVar = defpackage.zke.a;
                yqjVar.S("Ignoring unexpected message continuation in %s: head %s; got %s %s", str, new defpackage.zkf(zkeVar, strB), new defpackage.zkf(zkeVar, b(message.what)), c(message));
            } else {
                inj injVar = this.a;
                if (injVar != null) {
                    injVar.c(i2, message.what);
                }
                sendMessage(message);
            }
        }
    }

    @Override // android.os.Handler
    public final java.lang.String toString() {
        int i2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CMH{[");
        java.util.Iterator it = this.c.iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.os.Message message = (android.os.Message) it.next();
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
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm:ss.SSS");
        defpackage.zg zgVar = this.k;
        synchronized (zgVar) {
            for (i2 = 0; i2 < zgVar.a(); i2++) {
                if (i2 >= zgVar.a()) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                java.lang.Object obj = zgVar.a[(zgVar.b + i2) & zgVar.d];
                obj.getClass();
                android.util.Pair pair = (android.util.Pair) obj;
                sb.append("  ");
                sb.append(simpleDateFormat.format(new java.util.Date(((java.lang.Long) pair.first).longValue())));
                sb.append(" : ");
                sb.append((java.lang.String) pair.second);
                if (i2 < zgVar.a()) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
