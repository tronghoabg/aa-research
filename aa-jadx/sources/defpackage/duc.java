package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class duc {
    public static float b(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int c(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static void d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean e(byte b) {
        return b > -65;
    }

    public static boolean f(byte b) {
        return b >= 0;
    }

    public static java.lang.String g(defpackage.eix eixVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(eixVar.c());
        for (int i = 0; i < eixVar.c(); i++) {
            byte bA = eixVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    private static android.app.Notification.Metric.MetricValue h(defpackage.dtz dtzVar) {
        android.app.Notification.Metric.TimeDifference timeDifferenceForPausedStopwatch;
        if (!(dtzVar instanceof defpackage.dua)) {
            if (dtzVar instanceof defpackage.dtu) {
                defpackage.dtu dtuVar = (defpackage.dtu) dtzVar;
                j$.time.LocalDate localDate = dtuVar.a;
                return new android.app.Notification.Metric.FixedDate(j$.time.TimeConversions.convert(localDate), dtuVar.b);
            }
            if (dtzVar instanceof defpackage.dtv) {
                defpackage.dtv dtvVar = (defpackage.dtv) dtzVar;
                return new android.app.Notification.Metric.FixedFloat(dtvVar.a, dtvVar.b, dtvVar.c, dtvVar.d);
            }
            if (dtzVar instanceof defpackage.dtw) {
                defpackage.dtw dtwVar = (defpackage.dtw) dtzVar;
                return new android.app.Notification.Metric.FixedInt(dtwVar.a, dtwVar.b);
            }
            if (dtzVar instanceof defpackage.dtx) {
                defpackage.dtx dtxVar = (defpackage.dtx) dtzVar;
                return new android.app.Notification.Metric.FixedText(dtxVar.a, dtxVar.b);
            }
            if (dtzVar instanceof defpackage.dty) {
                return new android.app.Notification.Metric.FixedTime(j$.time.TimeConversions.convert(((defpackage.dty) dtzVar).a));
            }
            java.util.Objects.toString(dtzVar);
            throw new java.lang.IllegalArgumentException("Unexpected MetricValue: ".concat(dtzVar.toString()));
        }
        defpackage.dua duaVar = (defpackage.dua) dtzVar;
        j$.time.Instant instant = duaVar.a;
        if (instant == null) {
            java.lang.Long l = duaVar.b;
            if (l == null) {
                j$.time.Duration duration = duaVar.c;
                if (duration == null) {
                    java.util.Objects.toString(duaVar);
                    throw new java.lang.IllegalArgumentException("Unexpected TimeDifference: ".concat(duaVar.toString()));
                }
                if (duaVar.d) {
                    timeDifferenceForPausedStopwatch = android.app.Notification.Metric.TimeDifference.forPausedTimer(j$.time.TimeConversions.convert(duration), duaVar.e);
                } else {
                    timeDifferenceForPausedStopwatch = android.app.Notification.Metric.TimeDifference.forPausedStopwatch(j$.time.TimeConversions.convert(duration), duaVar.e);
                }
            } else if (duaVar.d) {
                timeDifferenceForPausedStopwatch = android.app.Notification.Metric.TimeDifference.forTimer(l.longValue(), duaVar.e);
            } else {
                timeDifferenceForPausedStopwatch = android.app.Notification.Metric.TimeDifference.forStopwatch(l.longValue(), duaVar.e);
            }
        } else if (duaVar.d) {
            timeDifferenceForPausedStopwatch = android.app.Notification.Metric.TimeDifference.forTimer(j$.time.TimeConversions.convert(instant), duaVar.e);
        } else {
            timeDifferenceForPausedStopwatch = android.app.Notification.Metric.TimeDifference.forStopwatch(j$.time.TimeConversions.convert(instant), duaVar.e);
        }
        return (android.app.Notification.Metric.MetricValue) timeDifferenceForPausedStopwatch;
    }

    private static android.app.Notification.Metric i(defpackage.dub dubVar) {
        return new android.app.Notification.Metric(h(dubVar.a), dubVar.b, dubVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.app.Notification.Style j(defpackage.dud dudVar) {
        android.app.Notification.Style metricStyle = new android.app.Notification.MetricStyle();
        java.util.Iterator it = dudVar.f().iterator();
        while (it.hasNext()) {
            metricStyle.addMetric(i((defpackage.dub) it.next()));
        }
        java.util.List listF = dudVar.f();
        int i = dudVar.b;
        defpackage.dub dubVar = null;
        if (i >= 0) {
            java.util.List list = dudVar.a;
            if (i < list.size()) {
                dubVar = (defpackage.dub) list.get(dudVar.b);
            }
        }
        metricStyle.setCriticalMetric(listF.indexOf(dubVar));
        return metricStyle;
    }
}
