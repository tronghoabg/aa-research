package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import com.google.android.apps.auto.components.calendar.model.CalendarReminder;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class kha extends lhf {
    public static final yph a = yph.c("GH.CalendarReminderSrvc");
    public boolean c;
    private final eqj d = khx.f().b(khx.f().d());
    public final Set b = new HashSet();
    private final Handler e = new Handler();

    public final void a() {
        mdh.c();
        mdg mdgVarA = mdh.a();
        ((ype) a.l().ai((char) 3078)).y("Checking gateState: %s", mdgVarA);
        if (mdgVarA == mdg.a) {
            this.d.fE(this, new eqn() { // from class: kgy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eqn
                public final void eS(Object obj) {
                    String string;
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        kha khaVar = this.a;
                        if (!it.hasNext()) {
                            khaVar.c = true;
                            return;
                        }
                        CalendarReminder calendarReminder = (CalendarReminder) it.next();
                        boolean zAdd = khaVar.b.add(new kgz(calendarReminder.b(), calendarReminder.d(), calendarReminder.a()));
                        boolean zIsEmpty = kgv.a().b.isEmpty();
                        yph yphVar = kha.a;
                        ((ype) ((ype) yphVar.f()).ai(3075)).R("Maybe posting notification: new=%b, suppressed=%b, startOfDriveHasPassed=%b", Boolean.valueOf(zAdd), Boolean.valueOf(!zIsEmpty), Boolean.valueOf(khaVar.c));
                        if (zAdd && zIsEmpty) {
                            int iHash = Objects.hash(CalendarReminder.class, Long.valueOf(calendarReminder.d()), Long.valueOf(calendarReminder.b()));
                            kgx kgxVar = (kgx) mki.a.i(kgx.class);
                            boolean z = khaVar.c;
                            num numVar = new num();
                            numVar.a = z ? nup.HIGH : nup.DEFAULT;
                            numVar.m = calendarReminder.i();
                            khc.c();
                            numVar.n = khc.b(calendarReminder);
                            numVar.j = false;
                            numVar.A = nun.b;
                            numVar.f = "com.google.android.projection.gearhead";
                            numVar.C = calendarReminder.j();
                            ComponentName componentName = mkn.p;
                            numVar.d = GhIcon.j(componentName);
                            kgw kgwVar = kgw.a;
                            yzz yzzVar = yzz.CALENDAR_REMINDER_NOTIFICATION_CENTER;
                            numVar.c = kgwVar.a(calendarReminder, yzzVar);
                            Context context = (Context) kgxVar.a;
                            GhIcon ghIconB = kgwVar.b(context);
                            if (ghIconB != null) {
                                numVar.b = ghIconB;
                            }
                            kgw kgwVarA = kgx.a(calendarReminder);
                            if (kgwVarA == null) {
                                kgwVarA = kgw.e;
                            }
                            kgw kgwVar2 = kgw.e;
                            if (kgwVarA != kgwVar2) {
                                aaew aaewVar = new aaew(null);
                                aaewVar.b = kgwVarA.a(calendarReminder, yzzVar);
                                int iOrdinal = kgwVarA.ordinal();
                                if (iOrdinal == 0) {
                                    string = null;
                                    aaewVar.d = string;
                                    numVar.p = new nul(aaewVar);
                                } else {
                                    if (iOrdinal == 1) {
                                        string = context.getString(R.string.reminder_notification_navigate);
                                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                                        string = context.getString(R.string.reminder_notification_call);
                                    } else {
                                        if (iOrdinal != 4) {
                                            throw new RuntimeException(null, null);
                                        }
                                        string = null;
                                    }
                                    aaewVar.d = string;
                                    numVar.p = new nul(aaewVar);
                                }
                            }
                            nuc nucVar = new nuc();
                            nucVar.b = GhIcon.j(componentName);
                            nucVar.c = calendarReminder.i();
                            khc.c();
                            nucVar.d = khc.b(calendarReminder);
                            kgw kgwVarA2 = kgx.a(calendarReminder);
                            if (kgwVarA2 != null) {
                                kgwVar = kgwVarA2;
                            }
                            GhIcon ghIconB2 = kgwVar.b(context);
                            yzz yzzVar2 = yzz.CALENDAR_REMINDER_HUN;
                            PendingIntent pendingIntentA = kgwVar.a(calendarReminder, yzzVar2);
                            if (ghIconB2 != null) {
                                nucVar.e = ghIconB2;
                            }
                            if (pendingIntentA != null) {
                                nucVar.i = pendingIntentA;
                            }
                            yfq yfqVarB = kgx.b(calendarReminder);
                            kgw kgwVar3 = ((yls) yfqVarB).c >= 2 ? (kgw) yfqVarB.get(1) : null;
                            if (kgwVar3 != null && kgwVar3 != kgwVar2) {
                                aaew aaewVar2 = new aaew(null);
                                aaewVar2.e = kgwVar3.b(context);
                                aaewVar2.b = kgwVar3.a(calendarReminder, yzzVar2);
                                nucVar.f = new nul(aaewVar2);
                            }
                            numVar.t = new nud(nucVar);
                            numVar.B = componentName;
                            nur nurVarB = numVar.b();
                            ((ype) yphVar.l().ai(3076)).w("Posting notification with id: %d", iHash);
                            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.CALENDAR_APP, yzy.tc).l());
                            mcb.b().b.e("GH.CalendarReminderSrvc", iHash, nurVarB);
                        }
                    }
                }
            });
            this.e.removeCallbacksAndMessages(null);
        } else {
            this.c = true;
            this.e.postDelayed(new kea(this, 10), 60000L);
        }
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        a();
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        this.d.l(this);
    }
}
