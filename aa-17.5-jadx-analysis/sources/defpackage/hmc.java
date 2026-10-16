package defpackage;

import android.content.res.Resources;
import androidx.car.app.messaging.model.CarMessage;
import androidx.car.app.model.CarText;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class hmc implements hem {
    public final geu a;

    public hmc(geu geuVar) {
        this.a = geuVar;
    }

    public static final String c(Resources resources, String str) {
        return resources.getString(R.string.sender_and_body, resources.getString(R.string.self_sender), str);
    }

    public final String a(CarMessage carMessage) {
        if (carMessage.getBody() == null) {
            return this.a.getResources().getString(R.string.messaging_style_multimedia_message_with_empty_body);
        }
        CarText body = carMessage.getBody();
        body.getClass();
        return body.toString();
    }

    public final String b(CarMessage carMessage) {
        geu geuVar = this.a;
        return String.valueOf(String.format(" %s ", geuVar.getString(R.string.bullet))).concat(String.valueOf(hbz.n(geuVar, carMessage.getReceivedTimeEpochMillis())));
    }
}
