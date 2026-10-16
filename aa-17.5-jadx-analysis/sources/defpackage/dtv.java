package defpackage;

import android.app.Notification;
import android.content.ContentProviderClient;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.TimeConversions;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class dtv {
    public static final void b(ContentProviderClient contentProviderClient) throws Exception {
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    public static float c(float[] fArr, float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = f - (iMin * 0.005f);
        float f3 = fArr[iMin];
        return f3 + ((f2 / 0.005f) * (fArr[iMin + 1] - f3));
    }

    public static final vo d(bux buxVar) {
        Object[] objArr = new Object[0];
        cdt cdtVar = new cdt(new dne(3), new dmw(9));
        Object objG = buxVar.g();
        if (objG == buw.a) {
            objG = new eup(1);
            buxVar.x(objG);
        }
        return (vo) byx.r(objArr, cdtVar, (afdr) objG, buxVar, 384);
    }

    private static Notification.Metric.MetricValue e(dts dtsVar) {
        Notification.Metric.TimeDifference timeDifferenceForPausedStopwatch;
        if (!(dtsVar instanceof dtt)) {
            if (dtsVar instanceof dtn) {
                dtn dtnVar = (dtn) dtsVar;
                LocalDate localDate = dtnVar.a;
                return new Notification.Metric.FixedDate(TimeConversions.convert(localDate), dtnVar.b);
            }
            if (dtsVar instanceof dto) {
                dto dtoVar = (dto) dtsVar;
                return new Notification.Metric.FixedFloat(dtoVar.a, dtoVar.b, dtoVar.c, dtoVar.d);
            }
            if (dtsVar instanceof dtp) {
                dtp dtpVar = (dtp) dtsVar;
                return new Notification.Metric.FixedInt(dtpVar.a, dtpVar.b);
            }
            if (dtsVar instanceof dtq) {
                dtq dtqVar = (dtq) dtsVar;
                return new Notification.Metric.FixedText(dtqVar.a, dtqVar.b);
            }
            if (dtsVar instanceof dtr) {
                return new Notification.Metric.FixedTime(TimeConversions.convert(((dtr) dtsVar).a));
            }
            Objects.toString(dtsVar);
            throw new IllegalArgumentException("Unexpected MetricValue: ".concat(dtsVar.toString()));
        }
        dtt dttVar = (dtt) dtsVar;
        Instant instant = dttVar.a;
        if (instant == null) {
            Long l = dttVar.b;
            if (l == null) {
                Duration duration = dttVar.c;
                if (duration == null) {
                    Objects.toString(dttVar);
                    throw new IllegalArgumentException("Unexpected TimeDifference: ".concat(dttVar.toString()));
                }
                if (dttVar.d) {
                    timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forPausedTimer(TimeConversions.convert(duration), dttVar.e);
                } else {
                    timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forPausedStopwatch(TimeConversions.convert(duration), dttVar.e);
                }
            } else if (dttVar.d) {
                timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forTimer(l.longValue(), dttVar.e);
            } else {
                timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forStopwatch(l.longValue(), dttVar.e);
            }
        } else if (dttVar.d) {
            timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forTimer(TimeConversions.convert(instant), dttVar.e);
        } else {
            timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forStopwatch(TimeConversions.convert(instant), dttVar.e);
        }
        return (Notification.Metric.MetricValue) timeDifferenceForPausedStopwatch;
    }

    private static Notification.Metric f(dtu dtuVar) {
        return new Notification.Metric(e(dtuVar.a), dtuVar.b, dtuVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Notification.Style g(dtw dtwVar) {
        Notification.Style metricStyle = new Notification.MetricStyle();
        Iterator it = dtwVar.f().iterator();
        while (it.hasNext()) {
            metricStyle.addMetric(f((dtu) it.next()));
        }
        List listF = dtwVar.f();
        int i = dtwVar.b;
        dtu dtuVar = null;
        if (i >= 0) {
            List list = dtwVar.a;
            if (i < list.size()) {
                dtuVar = (dtu) list.get(dtwVar.b);
            }
        }
        metricStyle.setCriticalMetric(listF.indexOf(dtuVar));
        return metricStyle;
    }
}
