package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class qju implements Comparator {
    private static final yph a = yph.c("GH.StreamItemComparator");
    private final SparseIntArray b = new SparseIntArray();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(moa moaVar, moa moaVar2) {
        try {
            SparseIntArray sparseIntArray = this.b;
            int i = sparseIntArray.get(moaVar.hashCode());
            int i2 = sparseIntArray.get(moaVar2.hashCode());
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            if (moaVar.B() > moaVar2.B()) {
                return -1;
            }
            return moaVar.B() < moaVar2.B() ? 1 : 0;
        } catch (NullPointerException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7420)).u("");
            throw new IllegalStateException("Use StreamItemComparator.sort() instead of Collections.sort()");
        }
    }

    public final void b(List list) {
        int i;
        SparseIntArray sparseIntArray = this.b;
        sparseIntArray.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            moa moaVar = (moa) list.get(i2);
            int iHashCode = moaVar.hashCode();
            if (moaVar.I().equals(yzr.OPT_IN_ABOVE_ONGOING)) {
                i = 0;
            } else if (moaVar.I().equals(yzr.NAV_NOTIFICATION_HERO)) {
                i = 1;
            } else if (moaVar.I().equals(yzr.CALL)) {
                i = 2;
            } else if (moaVar.I().equals(yzr.SDK_NOTIFICATION)) {
                i = 3;
            } else if (moaVar.I().equals(yzr.MEDIA)) {
                i = 4;
            } else if (moaVar.I().equals(yzr.OPT_IN_BELOW_ONGOING)) {
                i = 5;
            } else if (moaVar.I().equals(yzr.NAV_NOTIFICATION_NORMAL)) {
                i = 6;
            } else if (moaVar.I().equals(yzr.VISUAL_PREVIEW_DISCOVERY)) {
                i = 7;
            } else {
                yzr yzrVarI = moaVar.I();
                yzr yzrVar = yzr.GMM_SUGGESTION;
                if (yzrVarI.equals(yzrVar)) {
                    moaVar.Y();
                }
                int i3 = 9;
                if (moaVar.I().equals(yzr.NOW_CAR_RENTAL) || moaVar.I().equals(yzr.NOW_FLIGHT_STATUS) || moaVar.I().equals(yzr.NOW_CONCERT_TICKET) || moaVar.I().equals(yzr.NOW_SPORT_EVENT_TICKET) || moaVar.I().equals(yzr.NOW_RESTAURANT_PLACE) || moaVar.I().equals(yzr.NOW_HOTEL_PLACE) || moaVar.I().equals(yzr.NOW_ROUTINE)) {
                    i = i3;
                } else {
                    yzr yzrVarI2 = moaVar.I();
                    yzr yzrVar2 = yzr.NOW_CALENDAR_EVENT;
                    if (yzrVarI2.equals(yzrVar2)) {
                        moaVar.X();
                    }
                    if (moaVar.I().equals(yzrVar)) {
                        moaVar.X();
                    }
                    yzr yzrVarI3 = moaVar.I();
                    yzr yzrVar3 = yzr.NAV_SUGGESTION;
                    if (yzrVarI3.equals(yzrVar3)) {
                        moaVar.X();
                    }
                    if (moaVar.I().equals(yzrVar2)) {
                        i = 17;
                    } else {
                        yzr yzrVarI4 = moaVar.I();
                        yzr yzrVar4 = yzr.NOW_REMINDER;
                        if (yzrVarI4.equals(yzrVar4) && !TextUtils.isEmpty(moaVar.L())) {
                            i = 18;
                        } else if (moaVar.I().equals(yzr.IM_NOTIFICATION) || moaVar.I().equals(yzr.SMS_NOTIFICATION)) {
                            i = 19;
                        } else if (moaVar.I().equals(yzr.RECENT_CALL)) {
                            i = 20;
                        } else if (moaVar.I().equals(yzrVar)) {
                            moaVar.X();
                            i = 21;
                        } else if (moaVar.I().equals(yzrVar3)) {
                            moaVar.X();
                            i = 24;
                        } else if (moaVar.I().equals(yzrVar4)) {
                            i = 27;
                        } else {
                            yph yphVar = a;
                            i3 = 28;
                            if (((ype) yphVar.h()).Z()) {
                                ((ype) ((ype) yphVar.h()).ai((char) 7421)).y("Unable to explicitly rank %s.", Objects.toString(moaVar));
                            }
                            i = i3;
                        }
                    }
                }
            }
            sparseIntArray.put(iHashCode, i);
        }
    }

    public final void c(List list) {
        b(list);
        Collections.sort(list, this);
    }
}
