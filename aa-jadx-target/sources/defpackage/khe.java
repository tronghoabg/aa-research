package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khe extends defpackage.lhm {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CalendarReminderSrvc");
    public boolean c;
    private final defpackage.eqp d = defpackage.kic.f().b(defpackage.kic.f().d());
    public final java.util.Set b = new java.util.HashSet();
    private final android.os.Handler e = new android.os.Handler();

    public final void a() {
        defpackage.mdp.c();
        defpackage.mdo mdoVarA = defpackage.mdp.a();
        ((defpackage.yqj) a.l().ai((char) 3081)).y("Checking gateState: %s", mdoVarA);
        if (mdoVarA == defpackage.mdo.a) {
            this.d.eM(this, new defpackage.eqt() { // from class: khc
                @Override // defpackage.eqt
                public final void ea(java.lang.Object obj) {
                    java.lang.String string;
                    java.util.Iterator it = ((java.util.List) obj).iterator();
                    while (true) {
                        defpackage.khe kheVar = this.a;
                        if (!it.hasNext()) {
                            kheVar.c = true;
                            return;
                        }
                        com.google.android.apps.auto.components.calendar.model.CalendarReminder calendarReminder = (com.google.android.apps.auto.components.calendar.model.CalendarReminder) it.next();
                        boolean zAdd = kheVar.b.add(new khd(calendarReminder.b(), calendarReminder.d(), calendarReminder.a()));
                        boolean zIsEmpty = defpackage.kgz.a().b.isEmpty();
                        defpackage.yqm yqmVar = defpackage.khe.a;
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(3078)).R("Maybe posting notification: new=%b, suppressed=%b, startOfDriveHasPassed=%b", java.lang.Boolean.valueOf(zAdd), java.lang.Boolean.valueOf(!zIsEmpty), java.lang.Boolean.valueOf(kheVar.c));
                        if (zAdd && zIsEmpty) {
                            int iHash = j$.util.Objects.hash(new java.lang.Object[]{com.google.android.apps.auto.components.calendar.model.CalendarReminder.class, java.lang.Long.valueOf(calendarReminder.d()), java.lang.Long.valueOf(calendarReminder.b())});
                            defpackage.khb khbVar = (defpackage.khb) defpackage.mkp.a.i(defpackage.khb.class);
                            boolean z = kheVar.c;
                            nvc nvcVar = new nvc();
                            nvcVar.a = z ? nvf.d : nvf.c;
                            nvcVar.m = calendarReminder.i();
                            defpackage.khg.c();
                            nvcVar.n = defpackage.khg.b(calendarReminder);
                            nvcVar.j = false;
                            nvcVar.A = nvd.b;
                            nvcVar.f = "com.google.android.projection.gearhead";
                            nvcVar.C = calendarReminder.j();
                            android.content.ComponentName componentName = defpackage.mkt.p;
                            nvcVar.d = com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName);
                            kha khaVar = kha.a;
                            defpackage.zbe zbeVar = defpackage.zbe.CALENDAR_REMINDER_NOTIFICATION_CENTER;
                            nvcVar.c = khaVar.a(calendarReminder, zbeVar);
                            android.content.Context context = (android.content.Context) khbVar.a;
                            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconB = khaVar.b(context);
                            if (ghIconB != null) {
                                nvcVar.b = ghIconB;
                            }
                            kha khaVarA = defpackage.khb.a(calendarReminder);
                            if (khaVarA == null) {
                                khaVarA = kha.e;
                            }
                            kha khaVar2 = kha.e;
                            if (khaVarA != khaVar2) {
                                aafz aafzVar = new aafz((byte[]) null);
                                aafzVar.b = khaVarA.a(calendarReminder, zbeVar);
                                int iOrdinal = khaVarA.ordinal();
                                if (iOrdinal == 0) {
                                    string = null;
                                } else if (iOrdinal == 1) {
                                    string = context.getString(2132084952);
                                } else if (iOrdinal == 2 || iOrdinal == 3) {
                                    string = context.getString(2132084951);
                                } else {
                                    if (iOrdinal != 4) {
                                        throw new java.lang.RuntimeException(null, null);
                                    }
                                    string = null;
                                }
                                aafzVar.d = string;
                                nvcVar.p = new nvb(aafzVar);
                            }
                            nuq nuqVar = new nuq();
                            nuqVar.b = com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName);
                            nuqVar.c = calendarReminder.i();
                            defpackage.khg.c();
                            nuqVar.d = defpackage.khg.b(calendarReminder);
                            kha khaVarA2 = defpackage.khb.a(calendarReminder);
                            if (khaVarA2 != null) {
                                khaVar = khaVarA2;
                            }
                            com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconB2 = khaVar.b(context);
                            defpackage.zbe zbeVar2 = defpackage.zbe.CALENDAR_REMINDER_HUN;
                            android.app.PendingIntent pendingIntentA = khaVar.a(calendarReminder, zbeVar2);
                            if (ghIconB2 != null) {
                                nuqVar.e = ghIconB2;
                            }
                            if (pendingIntentA != null) {
                                nuqVar.i = pendingIntentA;
                            }
                            defpackage.ygw ygwVarB = defpackage.khb.b(calendarReminder);
                            kha khaVar3 = ((defpackage.ymx) ygwVarB).c >= 2 ? (kha) ygwVarB.get(1) : null;
                            if (khaVar3 != null && khaVar3 != khaVar2) {
                                aafz aafzVar2 = new aafz((byte[]) null);
                                aafzVar2.e = khaVar3.b(context);
                                aafzVar2.b = khaVar3.a(calendarReminder, zbeVar2);
                                nuqVar.f = new nvb(aafzVar2);
                            }
                            nvcVar.t = new nur(nuqVar);
                            nvcVar.B = componentName;
                            nvh nvhVarB = nvcVar.b();
                            ((defpackage.yqj) yqmVar.l().ai(3079)).w("Posting notification with id: %d", iHash);
                            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CALENDAR_APP, defpackage.zbd.tg).l());
                            defpackage.mcj.b().b.e("GH.CalendarReminderSrvc", iHash, nvhVarB);
                        }
                    }
                }
            });
            this.e.removeCallbacksAndMessages(null);
        } else {
            this.c = true;
            this.e.postDelayed(new kcw(this, 19), 60000L);
        }
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        this.d.l(this);
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        a();
    }
}
