package com.waze;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.waze.strings.DisplayStrings;
import com.waze.web.SimpleWebActivity;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ResultStruct implements Parcelable, com.waze.sharedui.b {
    private static final int DIALOG_OK = 1;
    public static final int SUCCESS_CODE = 0;
    public final String action;
    public final String body;
    public final int code;
    public final String deepLink;
    public final String errorCode;
    public final boolean hideCloseButton;
    public final boolean showAsToast;
    private com.waze.sharedui.f.r stats;
    public final boolean terminal;
    public final String title;
    public static final Parcelable.Creator<ResultStruct> CREATOR = new Parcelable.Creator<ResultStruct>() { // from class: com.waze.ResultStruct.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultStruct createFromParcel(Parcel parcel) {
            return new ResultStruct(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ResultStruct[] newArray(int i2) {
            return new ResultStruct[i2];
        }
    };
    public static int MIN_NETWORK_ERROR_CODE = 200;
    public static int MAX_NETWORK_ERROR_CODE = DisplayStrings.DS_TRIP_OVERVIEW_CLOSURE_IMPACT_UNREACHABLE_DESTINATION_CLOSURE_ON_PS;

    protected ResultStruct(Parcel parcel) {
        this.code = parcel.readInt();
        this.title = parcel.readString();
        this.body = parcel.readString();
        this.action = parcel.readString();
        this.deepLink = parcel.readString();
        this.showAsToast = parcel.readByte() != 0;
        this.hideCloseButton = parcel.readByte() != 0;
        this.terminal = parcel.readByte() != 0;
        this.errorCode = parcel.readString();
        this.stats = null;
    }

    public static void addToBundle(Bundle bundle, ResultStruct resultStruct) {
        if (resultStruct != null) {
            bundle.putParcelable("ResultStruct", resultStruct);
        }
    }

    public static ResultStruct fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (ResultStruct) bundle.getParcelable("ResultStruct");
    }

    private static String getServerErrorString(int i2) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        return i2 != 0 ? aVarA.c(R.string.NETWORK_CONNECTION_PROBLEMS__PLEASE_TRY_AGAIN_LATER_PD, Integer.valueOf(i2)) : aVarA.c(R.string.NETWORK_CONNECTION_PROBLEMS__PLEASE_TRY_AGAIN_LATER_, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showError$0(com.waze.ab.q qVar, boolean z) {
        if (z) {
            openDeepLink(this.deepLink, lm.d().e());
        }
        if (qVar != null) {
            qVar.onClick(z);
        }
    }

    static /* synthetic */ com.waze.app_nav.hub.b.i lambda$showError$1(String str, String str2, final com.waze.ab.q qVar, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(str);
        oVar.P(str2);
        oVar.N(com.waze.shared_infra.o.b.a().c(R.string.OK, new Object[0]));
        oVar.w(5);
        oVar.C(false);
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.ResultStruct$$ExternalSyntheticLambda0
            @Override // com.waze.ab.q
            public final void onClick(boolean z) {
                ResultStruct.lambda$showError$2(qVar, z);
            }
        };
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    static /* synthetic */ void lambda$showError$2(com.waze.ab.q qVar, boolean z) {
        if (qVar != null) {
            qVar.onClick(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showError$3(NativeManager nativeManager) {
        nativeManager.CloseProgressPopup();
        String str = this.deepLink;
        if (str == null || str.isEmpty()) {
            return;
        }
        openDeepLink(str, lm.d().e());
    }

    public static void log(ResultStruct resultStruct, String str) {
        if (resultStruct == null) {
            com.waze.shared_infra.i.h.c(String.format(Locale.getDefault(), "%s: Missing Result Struct", str));
        } else if (resultStruct.isError()) {
            com.waze.shared_infra.i.h.c(String.format(Locale.getDefault(), "%s: Error RC=%d", str, Integer.valueOf(resultStruct.code)));
        } else {
            com.waze.shared_infra.i.h.a(String.format(Locale.getDefault(), "%s: Success RC=%d", str, Integer.valueOf(resultStruct.code)));
        }
    }

    private static void openDeepLink(String str, com.waze.sharedui.a.e eVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (str.contains("waze://")) {
            eVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return;
        }
        Intent intent = new Intent(eVar, (Class<?>) SimpleWebActivity.class);
        intent.putExtra("webViewURL", str);
        eVar.startActivityForResult(intent, 0);
    }

    private void showError(final com.waze.ab.q qVar, Runnable runnable) {
        boolean zHasServerError = hasServerError();
        if (this.showAsToast) {
            String str = this.title;
            final NativeManager nativeManager = NativeManager.getInstance();
            nativeManager.closeAndOpenProgressPopup(str, R.drawable.bigblue_x_icon);
            t.m(new Runnable() { // from class: com.waze.ResultStruct$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$showError$3(nativeManager);
                }
            }, 2000L);
            return;
        }
        String str2 = this.action;
        boolean z = (str2 == null || str2.isEmpty()) ? false : true;
        final String strC = zHasServerError ? this.title : com.waze.shared_infra.o.b.a().c(R.string.UHHOHE, new Object[0]);
        final String serverErrorString = zHasServerError ? this.body : getServerErrorString(this.code);
        if (!z) {
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("ResultStruct", new com.waze.app_nav.hub.b.j() { // from class: com.waze.ResultStruct$$ExternalSyntheticLambda2
                @Override // com.waze.app_nav.hub.b.j
                public final com.waze.app_nav.hub.b.i create(Context context) {
                    return ResultStruct.lambda$showError$1(strC, serverErrorString, qVar, context);
                }
            }));
            return;
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(strC);
        oVar.P(serverErrorString);
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.ResultStruct$$ExternalSyntheticLambda1
            @Override // com.waze.ab.q
            public final void onClick(boolean z2) {
                this.f$0.lambda$showError$0(qVar, z2);
            }
        };
        oVar.M(this.action);
        oVar.N(this.hideCloseButton ? null : com.waze.shared_infra.o.b.a().c(R.string.SERVER_ERROR_CLOSE, new Object[0]));
        oVar.R(this.action.length() > 8);
        oVar.K(runnable);
        com.waze.z.a.d.ai.q(oVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.waze.sharedui.b
    public int getCode() {
        return this.code;
    }

    @Override // com.waze.sharedui.b
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override // com.waze.sharedui.b
    public String getErrorMessage() {
        String str = this.title;
        return com.google.d.b.an.f(str) ? String.valueOf(this.code) : str;
    }

    @Override // com.waze.sharedui.b
    public com.waze.sharedui.f.r getTransactionStats() {
        return this.stats;
    }

    @Override // com.waze.sharedui.b
    public boolean hasServerError() {
        String str = this.title;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.body;
        return (str2 == null || str2.isEmpty()) ? false : true;
    }

    public boolean isError() {
        return this.code != 0;
    }

    public boolean isNetworkError() {
        int i2 = this.code;
        return i2 >= MIN_NETWORK_ERROR_CODE && i2 <= MAX_NETWORK_ERROR_CODE;
    }

    public boolean isOk() {
        return this.code == 0;
    }

    @Override // com.waze.sharedui.b
    public boolean isSuccess() {
        return isOk();
    }

    public boolean isTerminal() {
        return this.terminal;
    }

    @Override // com.waze.sharedui.b
    public void openErrorDialog(Context context, Runnable runnable) {
        showError(null, runnable);
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("(ResultStruct rc=");
        sb.append(this.code);
        String str = this.title;
        if (str != null && !str.isEmpty()) {
            sb.append(", title=");
            sb.append(this.title);
        }
        String str2 = this.body;
        if (str2 != null && !str2.isEmpty()) {
            sb.append(", body=");
            sb.append(this.body);
        }
        sb.append(")");
        return sb.toString();
    }

    public void setTransactionStats(com.waze.sharedui.f.r rVar) {
        this.stats = rVar;
    }

    public String toString() {
        return prettyPrint();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.code);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.action);
        parcel.writeString(this.deepLink);
        parcel.writeByte(this.showAsToast ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hideCloseButton ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.terminal ? (byte) 1 : (byte) 0);
        parcel.writeString(this.errorCode);
    }

    public ResultStruct(int i2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.code = i2;
        this.title = str2;
        this.body = str3;
        this.action = str4;
        this.deepLink = null;
        this.showAsToast = z;
        this.hideCloseButton = z2;
        this.terminal = false;
        this.errorCode = str;
        this.stats = null;
    }

    public ResultStruct(int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, com.waze.sharedui.f.r rVar) {
        this.code = i2;
        this.title = str;
        this.body = str2;
        this.action = str3;
        this.deepLink = str4;
        this.showAsToast = z;
        this.hideCloseButton = z2;
        this.terminal = z3;
        this.errorCode = str6;
        this.stats = rVar;
    }

    public ResultStruct(int i2, String str, String str2, String str3, boolean z, boolean z2) {
        this.code = i2;
        this.title = str;
        this.body = str2;
        this.action = str3;
        this.deepLink = null;
        this.showAsToast = z;
        this.hideCloseButton = z2;
        this.terminal = false;
        this.errorCode = "";
        this.stats = null;
    }

    public ResultStruct() {
        this(0);
    }

    public ResultStruct(int i2) {
        this.code = i2;
        this.title = null;
        this.body = null;
        this.action = null;
        this.deepLink = null;
        this.showAsToast = false;
        this.hideCloseButton = false;
        this.terminal = false;
        this.errorCode = "";
        this.stats = null;
    }

    public void showError(com.waze.ab.q qVar) {
        showError(qVar, null);
    }
}
