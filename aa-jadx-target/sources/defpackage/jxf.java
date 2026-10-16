package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jxf implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ jxf(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                ((ggq) obj).getClass();
                return java.lang.Boolean.FALSE;
            case 1:
                ((ggq) obj).getClass();
                return java.lang.Boolean.FALSE;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = jxi.a;
                return defpackage.lpg.j().f((android.content.ComponentName) obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num.intValue() != -1) {
                    return num;
                }
                return null;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState.getClass();
                return (android.support.v4.media.session.PlaybackStateCompat) aaPlaybackState.b;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.util.List list = (java.util.List) obj;
                if (list == null) {
                    return -1;
                }
                if (list.isEmpty()) {
                    return 0;
                }
                return list.get(0);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.content.Context context = (android.content.Context) obj;
                context.getClass();
                return new com.google.android.apps.auto.components.apphost.signin.MaterialCarRestrictedEditText(context, (android.util.AttributeSet) null, 2, (defpackage.affu) null);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate minimizedStateNavigationTemplate = (com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate) obj;
                minimizedStateNavigationTemplate.getClass();
                return minimizedStateNavigationTemplate.getOriginalTemplate();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate minimizedStateMapBasedTemplate = (com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate) obj;
                minimizedStateMapBasedTemplate.getClass();
                wi originalTemplate = minimizedStateMapBasedTemplate.getOriginalTemplate();
                originalTemplate.getClass();
                return originalTemplate;
            case 9:
                com.android.car.libraries.apphost.external.model.GridWrapperTemplate gridWrapperTemplate = (com.android.car.libraries.apphost.external.model.GridWrapperTemplate) obj;
                gridWrapperTemplate.getClass();
                return java.lang.Boolean.valueOf(gridWrapperTemplate.getTemplate().isLoading());
            case 10:
                gfa gfaVar = (gfa) obj;
                gfaVar.getClass();
                return jvb.b(gfaVar) ? new jvg(gfaVar) : new jve(gfaVar);
            case 11:
                androidx.car.app.model.Action action = (androidx.car.app.model.Action) obj;
                action.getClass();
                return java.lang.Boolean.valueOf(1 == (action.getFlags() & 1));
            case 12:
                java.lang.Long l = (java.lang.Long) obj;
                kgv kgvVar = kgw.a;
                l.getClass();
                return j$.time.Instant.ofEpochMilli(l.longValue()).atZone(j$.time.ZoneId.systemDefault()).toLocalDate();
            case 13:
                java.lang.Long l2 = (java.lang.Long) obj;
                kgv kgvVar2 = kgw.a;
                android.content.Context context2 = defpackage.mkp.a.c;
                l2.getClass();
                return android.text.format.DateUtils.formatDateTime(context2, l2.longValue(), 26);
            case 14:
                java.lang.Long l3 = (java.lang.Long) obj;
                kgv kgvVar3 = kgw.a;
                l3.getClass();
                long jLongValue = l3.longValue();
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTimeInMillis(jLongValue);
                calendar.add(5, 0);
                calendar.set(11, 23);
                calendar.set(12, 59);
                calendar.set(13, 59);
                calendar.set(14, 0);
                return java.lang.Long.valueOf(calendar.getTimeInMillis());
            case 15:
                com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber calendarEventPhoneNumber = (com.google.android.apps.auto.components.calendar.calling.CalendarEventPhoneNumber) obj;
                calendarEventPhoneNumber.getClass();
                java.lang.String strA = calendarEventPhoneNumber.a();
                strA.getClass();
                return strA;
            case 16:
                int i = defpackage.khn.a;
                long epochMilli = ((j$.time.LocalDate) obj).atStartOfDay(j$.time.ZoneOffset.UTC).toInstant().toEpochMilli() + 1;
                return defpackage.khn.b(epochMilli, epochMilli, true);
            case 17:
                defpackage.dzp dzpVar = (defpackage.dzp) obj;
                int i2 = defpackage.khn.a;
                java.lang.Long l4 = (java.lang.Long) dzpVar.a;
                l4.getClass();
                long jLongValue2 = l4.longValue();
                java.lang.Long l5 = (java.lang.Long) dzpVar.b;
                l5.getClass();
                return defpackage.khn.b(jLongValue2, l5.longValue(), false);
            case 18:
                long jLongValue3 = ((java.lang.Long) obj).longValue();
                defpackage.ygw ygwVar = defpackage.khq.a;
                defpackage.xb xbVarA = defpackage.kfm.a();
                xbVarA.d(android.provider.CalendarContract.CalendarAlerts.CONTENT_URI);
                xbVarA.b(defpackage.khq.a);
                xbVarA.b = java.lang.String.format(java.util.Locale.US, "(%s < ?) AND (%s > ?) AND (%s != %d) AND (%s = 1) AND (%s != ?) AND (%s = 0)", "alarmTime", "begin", "state", 2, "visible", "selfAttendeeStatus", "allDay");
                java.lang.String strValueOf = java.lang.String.valueOf(jLongValue3);
                xbVarA.c(defpackage.ygw.s(strValueOf, strValueOf, "2"));
                xbVarA.a = java.lang.String.format(java.util.Locale.US, "%s ASC, %s ASC, %s ASC, %s ASC", "begin", "end", "event_id", "alarmTime");
                return xbVarA.a();
            case 19:
                return defpackage.ygw.z(cjd.e, (java.util.List) obj);
            default:
                defpackage.yqm yqmVar2 = defpackage.kic.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.Map) obj).values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll((java.util.List) it.next());
                }
                j$.util.List.-EL.sort(arrayList, cjd.e);
                return arrayList;
        }
    }
}
