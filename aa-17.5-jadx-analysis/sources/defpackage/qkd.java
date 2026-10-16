package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.util.List;

/* loaded from: classes2.dex */
public final class qkd extends qkk {
    public static final /* synthetic */ int f = 0;
    private static final yph i = yph.c("GH.MediaPresAdapter");
    final omm a;
    public boolean b;
    public qkc c;
    public lmc d;
    public boolean e;
    private final Context j;
    private final ljv k;
    private final omu l;

    public qkd(ykd ykdVar, ljv ljvVar, omu omuVar) {
        super(ykdVar);
        this.a = new omm(tfj.GEARHEAD_CAR_PROJECTION_MEDIA_STREAM_ITEM_ALBUM_ART, new qka(this));
        this.b = false;
        this.c = qkc.a;
        this.d = null;
        this.e = false;
        this.k = ljvVar;
        this.l = omuVar;
        this.j = mki.a.c;
        lbh.d().gK(new qkb(this));
    }

    private final PendingIntent g(String str, ComponentName componentName, AaPlaybackState.AaCustomAction aaCustomAction) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_ID", str);
        bundle.putParcelable("EXTRA_COMPONENT_NAME", componentName);
        if (aaCustomAction != null) {
            bundle.putParcelable("CUSTOM_ACTION", aaCustomAction);
        }
        return roc.bo(this.g, bundle);
    }

    private final nul h(Context context, int i2, boolean z, List list, String str, ComponentName componentName) {
        AaPlaybackState.AaCustomAction aaCustomAction;
        GhIcon ghIconQ;
        if (z) {
            ghIconQ = GhIcon.p(context, i2);
            aaCustomAction = null;
        } else {
            if (list.isEmpty()) {
                return null;
            }
            aaCustomAction = (AaPlaybackState.AaCustomAction) list.remove(0);
            int iO = aaCustomAction.O();
            Resources resources = this.k.a().g;
            Resources resources2 = context.getResources();
            resources.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
            try {
                ghIconQ = GhIcon.q(resources, aaCustomAction.O());
            } catch (Resources.NotFoundException unused) {
                ((ype) ((ype) i.h()).ai((char) 7446)).w("unable to get custom media icon resource: %d", iO);
                return null;
            }
        }
        aaew aaewVar = new aaew(null);
        aaewVar.e = ghIconQ;
        aaewVar.b = g(str, componentName, aaCustomAction);
        return new nul(aaewVar);
    }

    private static String i(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? "" : charSequence.toString();
    }

    private final void j(qkc qkcVar) {
        woy.aa(qkcVar != this.c, "State machine must not have self-targeting transitions.");
        woy.aa(qkcVar != qkc.a, "Cannot switch to before start of drive state.");
        this.c = qkcVar;
        ((ype) ((ype) i.f()).ai((char) 7451)).y("Moved to state: %s", qkcVar);
        if (qkcVar == qkc.b) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PROJECTION_NOTIFICATION, yzy.gX);
            rrbVarH.p(this.k.a().a);
            ohsVarJ.F(rrbVarH.l());
        }
    }

    private static boolean k(AaPlaybackState aaPlaybackState) {
        return aaPlaybackState != null && aaPlaybackState.Q() == 3;
    }

    private static boolean l(AaPlaybackState aaPlaybackState) {
        return (aaPlaybackState == null || aaPlaybackState.Q() == 2 || aaPlaybackState.Q() == 1 || aaPlaybackState.Q() == 3) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0284  */
    @Override // defpackage.qkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.nur a(defpackage.moa r24) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkd.a(moa):nur");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qkj
    public final void b(Bundle bundle) {
        String string = bundle.getString("ACTION_ID", "");
        ComponentName componentName = (ComponentName) bundle.getParcelable("EXTRA_COMPONENT_NAME");
        AaPlaybackState.AaCustomAction aaCustomAction = bundle.containsKey("CUSTOM_ACTION") ? (AaPlaybackState.AaCustomAction) bundle.getParcelable("CUSTOM_ACTION") : null;
        yph yphVar = i;
        ype ypeVar = (ype) yphVar.l().ai(7448);
        zjc zjcVar = zjc.a;
        ypeVar.R("componentName=%s, handleNotificationAction id=%s customAction=%s", new zjd(zjcVar, componentName), string, aaCustomAction);
        ljv ljvVar = this.k;
        ComponentName componentName2 = ljvVar.a().a;
        if (!componentName.equals(componentName2)) {
            ((ype) ((ype) yphVar.h()).ai(7449)).M("Action component mismatch: notification=%s mediaModel=%s", new zjd(zjcVar, componentName), componentName2);
            return;
        }
        switch (string.hashCode()) {
            case -1775336834:
                if (string.equals("ACTION_CENTER")) {
                    if (this.c == qkc.b) {
                        this.e = true;
                    }
                    this.l.h(ljvVar, yzz.PROJECTION_NOTIFICATION);
                    return;
                }
                break;
            case -529044254:
                if (string.equals("ACTION_ICON")) {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    mlq.f().c(4, intent);
                    return;
                }
                break;
            case -528953232:
                if (string.equals("ACTION_LEFT")) {
                    omu omuVar = this.l;
                    if (aaCustomAction != null) {
                        omuVar.e(ljvVar, yzz.PROJECTION_NOTIFICATION, aaCustomAction);
                        return;
                    } else {
                        omuVar.g(ljvVar, yzz.PROJECTION_NOTIFICATION);
                        return;
                    }
                }
                break;
            case 787979955:
                if (string.equals("ACTION_RIGHT")) {
                    omu omuVar2 = this.l;
                    if (aaCustomAction != null) {
                        omuVar2.e(ljvVar, yzz.PROJECTION_NOTIFICATION, aaCustomAction);
                        return;
                    } else {
                        omuVar2.f(ljvVar, yzz.PROJECTION_NOTIFICATION);
                        return;
                    }
                }
                break;
        }
        throw new IllegalArgumentException("unknown action id: ".concat(String.valueOf(string)));
    }

    @Override // defpackage.qkk, defpackage.qkj
    public final void c() {
        super.c();
        this.a.b(this.j);
    }
}
