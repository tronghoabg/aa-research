package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Metadata;
import androidx.car.app.model.Row;
import androidx.car.app.model.Toggle;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class haq {
    public static final yob a = yob.c("com/android/car/libraries/apphost/sectioneditem/model/RowInternalKt");

    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.han a(androidx.car.app.messaging.model.ConversationItem r33, defpackage.geu r34) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haq.a(androidx.car.app.messaging.model.ConversationItem, geu):han");
    }

    public static final han b(Row row, geu geuVar) {
        String strValueOf;
        String str;
        fzy fzyVarD;
        fzy fzyVarD2;
        CarProgressBar progressBar;
        row.getClass();
        gby gbyVarD = null;
        if (row.getNumericDecoration() < 0) {
            str = null;
        } else {
            if (row.getNumericDecoration() > 9) {
                geuVar.u();
                strValueOf = geuVar.getString(R.string.row_decoration_x_or_more, new Object[]{9});
            } else {
                strValueOf = String.valueOf(row.getNumericDecoration());
            }
            str = strValueOf;
        }
        boolean zIsEnabled = row.isEnabled();
        CarText title = row.getTitle();
        if (title == null) {
            throw new IllegalArgumentException("API requires the title to be non-null");
        }
        List<CarText> texts = row.getTexts();
        texts.getClass();
        CarIcon image = row.getImage();
        if (image != null) {
            hao haoVar = new hao(0);
            hao haoVar2 = new hao(2);
            ghw ghwVar = ghw.a;
            ghv ghvVar = ghv.a;
            ghvVar.getClass();
            fzyVarD = fxp.d(image, geuVar, haoVar, haoVar2, ghwVar, ghvVar);
        } else {
            fzyVarD = null;
        }
        int iB = goy.b(row.getRowImageType());
        uq onClickDelegate = row.getOnClickDelegate();
        fwc fwcVar = onClickDelegate != null ? new fwc(geuVar, onClickDelegate, 14) : null;
        Metadata metadata = row.getMetadata();
        boolean zIsIndexable = row.isIndexable();
        Toggle toggle = row.getToggle();
        gbw gbwVar = toggle != null ? new gbw(toggle.getOnCheckedChangeDelegate(), toggle.isChecked(), toggle.isEnabled()) : null;
        boolean zIsBrowsable = row.isBrowsable();
        List<Action> actions = row.getActions();
        actions.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(actions, 10));
        for (Action action : actions) {
            action.getClass();
            arrayList.add(new gmr(fvr.e(action, geuVar, null), null));
        }
        CarIcon endImage = row.getEndImage();
        if (endImage != null) {
            hao haoVar3 = new hao(3);
            hao haoVar4 = new hao(4);
            ghw ghwVar2 = ghw.a;
            ghv ghvVar2 = ghv.a;
            ghvVar2.getClass();
            fzyVarD2 = fxp.d(endImage, geuVar, haoVar3, haoVar4, ghwVar2, ghvVar2);
        } else {
            fzyVarD2 = null;
        }
        int iB2 = goy.b(row.getRowEndImageType());
        if (gcx.g(geuVar) && (progressBar = row.getProgressBar()) != null) {
            gbyVarD = fyh.d(progressBar);
        }
        han hanVar = new han(zIsEnabled, title, texts, false, fzyVarD, iB, fwcVar, metadata, zIsIndexable, str, gbwVar, zIsBrowsable, arrayList, fzyVarD2, iB2, gbyVarD, 8);
        gka.b(hanVar, row);
        return hanVar;
    }
}
