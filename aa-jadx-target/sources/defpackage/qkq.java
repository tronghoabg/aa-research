package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qkq implements java.util.Comparator {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.StreamItemComparator");
    private final android.util.SparseIntArray b = new android.util.SparseIntArray();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(mog mogVar, mog mogVar2) {
        try {
            android.util.SparseIntArray sparseIntArray = this.b;
            int i = sparseIntArray.get(mogVar.hashCode());
            int i2 = sparseIntArray.get(mogVar2.hashCode());
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            if (mogVar.B() > mogVar2.B()) {
                return -1;
            }
            return mogVar.B() < mogVar2.B() ? 1 : 0;
        } catch (java.lang.NullPointerException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 7445)).u("");
            throw new java.lang.IllegalStateException("Use StreamItemComparator.sort() instead of Collections.sort()");
        }
    }

    public final void b(java.util.List list) {
        int i;
        android.util.SparseIntArray sparseIntArray = this.b;
        sparseIntArray.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            mog mogVar = (mog) list.get(i2);
            int iHashCode = mogVar.hashCode();
            if (mogVar.I().equals(defpackage.zaw.OPT_IN_ABOVE_ONGOING)) {
                i = 0;
            } else if (mogVar.I().equals(defpackage.zaw.NAV_NOTIFICATION_HERO)) {
                i = 1;
            } else if (mogVar.I().equals(defpackage.zaw.CALL)) {
                i = 2;
            } else if (mogVar.I().equals(defpackage.zaw.SDK_NOTIFICATION)) {
                i = 3;
            } else if (mogVar.I().equals(defpackage.zaw.MEDIA)) {
                i = 4;
            } else if (mogVar.I().equals(defpackage.zaw.OPT_IN_BELOW_ONGOING)) {
                i = 5;
            } else if (mogVar.I().equals(defpackage.zaw.NAV_NOTIFICATION_NORMAL)) {
                i = 6;
            } else if (mogVar.I().equals(defpackage.zaw.VISUAL_PREVIEW_DISCOVERY)) {
                i = 7;
            } else {
                defpackage.zaw zawVarI = mogVar.I();
                defpackage.zaw zawVar = defpackage.zaw.GMM_SUGGESTION;
                if (zawVarI.equals(zawVar)) {
                    mogVar.Y();
                }
                int i3 = 9;
                if (mogVar.I().equals(defpackage.zaw.NOW_CAR_RENTAL) || mogVar.I().equals(defpackage.zaw.NOW_FLIGHT_STATUS) || mogVar.I().equals(defpackage.zaw.NOW_CONCERT_TICKET) || mogVar.I().equals(defpackage.zaw.NOW_SPORT_EVENT_TICKET) || mogVar.I().equals(defpackage.zaw.NOW_RESTAURANT_PLACE) || mogVar.I().equals(defpackage.zaw.NOW_HOTEL_PLACE) || mogVar.I().equals(defpackage.zaw.NOW_ROUTINE)) {
                    i = i3;
                } else {
                    defpackage.zaw zawVarI2 = mogVar.I();
                    defpackage.zaw zawVar2 = defpackage.zaw.NOW_CALENDAR_EVENT;
                    if (zawVarI2.equals(zawVar2)) {
                        mogVar.X();
                    }
                    if (mogVar.I().equals(zawVar)) {
                        mogVar.X();
                    }
                    defpackage.zaw zawVarI3 = mogVar.I();
                    defpackage.zaw zawVar3 = defpackage.zaw.NAV_SUGGESTION;
                    if (zawVarI3.equals(zawVar3)) {
                        mogVar.X();
                    }
                    if (mogVar.I().equals(zawVar2)) {
                        i = 17;
                    } else {
                        defpackage.zaw zawVarI4 = mogVar.I();
                        defpackage.zaw zawVar4 = defpackage.zaw.NOW_REMINDER;
                        if (zawVarI4.equals(zawVar4) && !android.text.TextUtils.isEmpty(mogVar.L())) {
                            i = 18;
                        } else if (mogVar.I().equals(defpackage.zaw.IM_NOTIFICATION) || mogVar.I().equals(defpackage.zaw.SMS_NOTIFICATION)) {
                            i = 19;
                        } else if (mogVar.I().equals(defpackage.zaw.RECENT_CALL)) {
                            i = 20;
                        } else if (mogVar.I().equals(zawVar)) {
                            mogVar.X();
                            i = 21;
                        } else if (mogVar.I().equals(zawVar3)) {
                            mogVar.X();
                            i = 24;
                        } else if (mogVar.I().equals(zawVar4)) {
                            i = 27;
                        } else {
                            defpackage.yqm yqmVar = a;
                            i3 = 28;
                            if (((defpackage.yqj) yqmVar.h()).Z()) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 7446)).y("Unable to explicitly rank %s.", j$.util.Objects.toString(mogVar));
                            }
                            i = i3;
                        }
                    }
                }
            }
            sparseIntArray.put(iHashCode, i);
        }
    }

    public final void c(java.util.List list) {
        b(list);
        java.util.Collections.sort(list, this);
    }
}
