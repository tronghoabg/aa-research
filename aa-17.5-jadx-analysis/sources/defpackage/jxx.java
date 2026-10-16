package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final /* synthetic */ class jxx implements us {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jxx(Object obj, Object obj2, ConversationItem conversationItem, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = conversationItem;
    }

    @Override // defpackage.us
    public final void onClick() throws Resources.NotFoundException {
        switch (this.d) {
            case 0:
                String str = ((lwr) this.a).d.b;
                str.getClass();
                Uri uri = Uri.parse(str);
                uri.getClass();
                String str2 = String.format("geo:0,0?q=%s", Arrays.copyOf(new Object[]{uri}, 1));
                str2.getClass();
                Uri uri2 = Uri.parse(str2);
                uri2.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", uri2);
                whg whgVar = (whg) this.b;
                jxv.h(yzy.KR, whgVar);
                mpe.a().i(intent);
                String packageName = ((ComponentName) whgVar.b).getPackageName();
                packageName.getClass();
                jxv.b((ConversationItem) this.c, packageName);
                break;
            case 1:
                whg whgVar2 = (whg) this.a;
                jxv.h(yzy.KP, whgVar2);
                NavigationCurrentPosition navigationCurrentPosition = (NavigationCurrentPosition) mad.e().b.e();
                Object obj = this.b;
                String strB = lvl.b((Context) obj, navigationCurrentPosition);
                Object obj2 = this.c;
                if (strB != null) {
                    geu geuVar = (geu) obj;
                    jxv.d(geuVar, (ConversationItem) obj2, strB);
                    jxv.e(geuVar, R.string.share_eta_sent_text);
                } else {
                    jxv.h(yzy.KQ, whgVar2);
                    jxv.e((geu) obj, R.string.share_eta_failed_text);
                }
                String packageName2 = ((ComponentName) whgVar2.b).getPackageName();
                packageName2.getClass();
                jxv.b((ConversationItem) obj2, packageName2);
                break;
            case 2:
                whg whgVar3 = (whg) this.a;
                jxv.h(yzy.KM, whgVar3);
                Location locationB = lbh.c().b();
                Object obj3 = this.b;
                String strC = lvl.c((Context) obj3, locationB);
                Object obj4 = this.c;
                if (strC != null) {
                    geu geuVar2 = (geu) obj3;
                    jxv.d(geuVar2, (ConversationItem) obj4, strC);
                    jxv.e(geuVar2, R.string.share_location_sent_text);
                } else {
                    jxv.h(yzy.KN, whgVar3);
                    jxv.e((geu) obj3, R.string.share_location_failed_text);
                }
                String packageName3 = ((ComponentName) whgVar3.b).getPackageName();
                packageName3.getClass();
                jxv.b((ConversationItem) obj4, packageName3);
                break;
            case 3:
                jxv.c((String) this.a);
                whg whgVar4 = (whg) this.b;
                jxv.h(yzy.KU, whgVar4);
                String packageName4 = ((ComponentName) whgVar4.b).getPackageName();
                packageName4.getClass();
                jxv.b((ConversationItem) this.c, packageName4);
                break;
            case 4:
                lwp lwpVar = ((lwr) this.a).d;
                String str3 = lwpVar.a;
                if (str3 == null || afyh.v(str3)) {
                    kwv kwvVarH = kfl.h();
                    Optional optionalEmpty = Optional.empty();
                    Optional optionalOf = Optional.of(osv.ASSISTANT_SMART_ACTION_CALL_SENDER_CLICKED);
                    String str4 = lwpVar.c;
                    str4.getClass();
                    kwvVarH.B(R.string.call_contact_query_text, optionalEmpty, optionalOf, woy.bg(str4));
                } else {
                    jxv.c(str3);
                }
                Object obj5 = this.c;
                whg whgVar5 = (whg) this.b;
                jxv.h(yzy.KV, whgVar5);
                String packageName5 = ((ComponentName) whgVar5.b).getPackageName();
                packageName5.getClass();
                jxv.b((ConversationItem) obj5, packageName5);
                break;
            case 5:
                uq onClickDelegate = ((Action) this.c).getOnClickDelegate();
                Object obj6 = this.a;
                if (onClickDelegate != null) {
                    ((kch) obj6).a.t().h(onClickDelegate);
                }
                ((kch) obj6).d.d(((Alert) this.b).getId());
                break;
            case 6:
                String str5 = ((lwr) this.a).d.b;
                str5.getClass();
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:0,0?q=%s", Uri.parse(str5))));
                whg whgVar6 = (whg) this.b;
                MaterialRowView.p(yzy.KR, whgVar6);
                mpe.a().i(intent2);
                MaterialRowView.n((ConversationItem) this.c, ((ComponentName) whgVar6.b).getPackageName());
                break;
            case 7:
                whg whgVar7 = (whg) this.a;
                MaterialRowView.p(yzy.KM, whgVar7);
                Location locationB2 = lbh.c().b();
                Object obj7 = this.b;
                String strA = lwr.a((Context) obj7, locationB2);
                Object obj8 = this.c;
                if (strA != null) {
                    geu geuVar3 = (geu) obj7;
                    MaterialRowView.c(geuVar3, (ConversationItem) obj8, strA);
                    MaterialRowView.e(geuVar3, R.string.share_location_sent_text);
                } else {
                    MaterialRowView.p(yzy.KN, whgVar7);
                    MaterialRowView.e((geu) obj7, R.string.share_location_failed_text);
                }
                MaterialRowView.n((ConversationItem) obj8, ((ComponentName) whgVar7.b).getPackageName());
                break;
            case 8:
                mpe.a().i(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf((String) this.a)))));
                whg whgVar8 = (whg) this.b;
                MaterialRowView.p(yzy.KU, whgVar8);
                MaterialRowView.n((ConversationItem) this.c, ((ComponentName) whgVar8.b).getPackageName());
                break;
            case 9:
                lwp lwpVar2 = ((lwr) this.a).d;
                String str6 = lwpVar2.a;
                if (str6 == null || roc.Z(str6)) {
                    kwv kwvVarH2 = kfl.h();
                    Optional optionalEmpty2 = Optional.empty();
                    Optional optionalOf2 = Optional.of(osv.ASSISTANT_SMART_ACTION_CALL_SENDER_CLICKED);
                    String str7 = lwpVar2.c;
                    str7.getClass();
                    kwvVarH2.B(R.string.call_contact_query_text, optionalEmpty2, optionalOf2, yfq.q(str7));
                } else {
                    mpe.a().i(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(str6)))));
                }
                Object obj9 = this.c;
                whg whgVar9 = (whg) this.b;
                MaterialRowView.p(yzy.KV, whgVar9);
                MaterialRowView.n((ConversationItem) obj9, ((ComponentName) whgVar9.b).getPackageName());
                break;
            case 10:
                whg whgVar10 = (whg) this.a;
                MaterialRowView.p(yzy.KP, whgVar10);
                NavigationCurrentPosition navigationCurrentPosition2 = (NavigationCurrentPosition) mad.e().b.e();
                Object obj10 = this.b;
                String strB2 = lvl.b((Context) obj10, navigationCurrentPosition2);
                Object obj11 = this.c;
                if (strB2 != null) {
                    geu geuVar4 = (geu) obj10;
                    MaterialRowView.c(geuVar4, (ConversationItem) obj11, strB2);
                    MaterialRowView.e(geuVar4, R.string.share_eta_sent_text);
                } else {
                    MaterialRowView.p(yzy.KQ, whgVar10);
                    MaterialRowView.e((geu) obj10, R.string.share_eta_failed_text);
                }
                MaterialRowView.n((ConversationItem) obj11, ((ComponentName) whgVar10.b).getPackageName());
                break;
            case 11:
                String str8 = ((lwr) this.a).d.b;
                str8.getClass();
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:0,0?q=%s", Uri.parse(str8))));
                whg whgVar11 = (whg) this.b;
                RowView.m(yzy.KR, whgVar11);
                mpe.a().i(intent3);
                RowView.l((ConversationItem) this.c, ((ComponentName) whgVar11.b).getPackageName());
                break;
            case 12:
                whg whgVar12 = (whg) this.a;
                RowView.m(yzy.KP, whgVar12);
                NavigationCurrentPosition navigationCurrentPosition3 = (NavigationCurrentPosition) mad.e().b.e();
                Object obj12 = this.b;
                String strB3 = lvl.b((Context) obj12, navigationCurrentPosition3);
                Object obj13 = this.c;
                if (strB3 != null) {
                    geu geuVar5 = (geu) obj12;
                    RowView.d(geuVar5, (ConversationItem) obj13, strB3);
                    RowView.f(geuVar5, R.string.share_eta_sent_text);
                } else {
                    RowView.m(yzy.KQ, whgVar12);
                    RowView.f((geu) obj12, R.string.share_eta_failed_text);
                }
                RowView.l((ConversationItem) obj13, ((ComponentName) whgVar12.b).getPackageName());
                break;
            case 13:
                lwp lwpVar3 = ((lwr) this.a).d;
                String str9 = lwpVar3.a;
                if (str9 == null || roc.Z(str9)) {
                    kwv kwvVarH3 = kfl.h();
                    Optional optionalEmpty3 = Optional.empty();
                    Optional optionalOf3 = Optional.of(osv.ASSISTANT_SMART_ACTION_CALL_SENDER_CLICKED);
                    String str10 = lwpVar3.c;
                    str10.getClass();
                    kwvVarH3.B(R.string.call_contact_query_text, optionalEmpty3, optionalOf3, yfq.q(str10));
                } else {
                    mpe.a().i(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(str9)))));
                }
                Object obj14 = this.c;
                whg whgVar13 = (whg) this.b;
                RowView.m(yzy.KV, whgVar13);
                RowView.l((ConversationItem) obj14, ((ComponentName) whgVar13.b).getPackageName());
                break;
            case 14:
                mpe.a().i(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf((String) this.a)))));
                whg whgVar14 = (whg) this.b;
                RowView.m(yzy.KU, whgVar14);
                RowView.l((ConversationItem) this.c, ((ComponentName) whgVar14.b).getPackageName());
                break;
            default:
                whg whgVar15 = (whg) this.a;
                RowView.m(yzy.KM, whgVar15);
                Location locationB3 = lbh.c().b();
                Object obj15 = this.b;
                String strA2 = lwr.a((Context) obj15, locationB3);
                Object obj16 = this.c;
                if (strA2 != null) {
                    geu geuVar6 = (geu) obj15;
                    RowView.d(geuVar6, (ConversationItem) obj16, strA2);
                    RowView.f(geuVar6, R.string.share_location_sent_text);
                } else {
                    RowView.m(yzy.KN, whgVar15);
                    RowView.f((geu) obj15, R.string.share_location_failed_text);
                }
                RowView.l((ConversationItem) obj16, ((ComponentName) whgVar15.b).getPackageName());
                break;
        }
    }

    public /* synthetic */ jxx(kch kchVar, Action action, Alert alert, int i) {
        this.d = i;
        this.a = kchVar;
        this.c = action;
        this.b = alert;
    }
}
