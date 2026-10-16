package com.waze;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.resources.ResourcesNativeManager;
import com.waze.sharedui.views.OvalButton;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class MessageBoxNativeManager extends gb {
    public static final int CONFIRM_DIALOG_CANCEL = 2;
    public static final int CONFIRM_DIALOG_CHECKBOX_CHECKED_VALUE = 1;
    public static final int CONFIRM_DIALOG_CHECKBOX_UNAVAILABLE_VALUE = -1;
    public static final int CONFIRM_DIALOG_CLOSE = 0;
    public static final int CONFIRM_DIALOG_NO = 4;
    public static final int CONFIRM_DIALOG_NULL = -1;
    public static final int CONFIRM_DIALOG_OK = 1;
    public static final int CONFIRM_DIALOG_YES = 3;
    public static final long NO_CALLBACK_POINTER_VALUE = -1;
    public static final int NO_TIMEOUT_DURATION_VALUE = -1;
    private static final String OPEN_CHOICE_BOTTOM_DIALOG_POPUP_TAG = "MessageBoxNativeManager_openChoiceBottomDialog";
    private static final String OPEN_CHOICE_DIALOG_POPUP_TAG = "MessageBoxNativeManager_openChoiceDialog";
    private static final String OPEN_MESSAGE_BOX_TIMEOUT_CB_POPUP_TAG = "MessageBoxNativeManager_OpenMessageBoxTimeoutCb";
    public static final String SHOW_POPUP_TAG = "MessageBoxNativeManager_Show";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$OpenConfirmDialogCustomTimeoutCb$0(long j2, long j3, int i2, int i3) {
        if (j2 != -1) {
            ConfirmDialogCallback(i2, j2, j3, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.waze.app_nav.hub.b.i lambda$OpenMessageBoxTimeoutCb$0(String str, String str2, String str3, int i2, final long j2, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(str);
        oVar.P(str2);
        oVar.M(str3);
        oVar.w(i2);
        oVar.f13808a = new km(1);
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar, new h.g.a.a() { // from class: com.waze.fm
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f23908a.lambda$OpenMessageBoxTimeoutCb$2(j2);
            }
        });
    }

    static /* synthetic */ void lambda$OpenMessageBoxTimeoutCb$1(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h.ab lambda$OpenMessageBoxTimeoutCb$2(long j2) {
        if (j2 != -1) {
            MsgBoxCallback(j2);
        }
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ShowAddSecondStopDialog$0(long j2, long j3, int i2, int i3) {
        if (j2 != -1) {
            ConfirmDialogCallback(i2, j2, j3, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ShowViaDangerZoneWarningDialog$0(long j2, long j3, int i2, int i3) {
        if (j2 != -1) {
            ConfirmDialogCallback(i2, j2, j3, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.waze.app_nav.hub.b.i lambda$openChoiceBottomDialog$0(String str, String str2, String str3, int i2, int i3, int i4, long j2, final int i5, boolean z, String str4, final long j3, final long j4, Context context) {
        final com.waze.sharedui.d.a aVar = new com.waze.sharedui.d.a(context);
        aVar.setContentView(R.layout.bottom_choice_dialog);
        ((TextView) aVar.findViewById(R.id.title)).setText(str);
        ((TextView) aVar.findViewById(R.id.message)).setText(str2);
        ((TextView) aVar.findViewById(R.id.primaryButtonLabel)).setText(str3);
        final OvalButton ovalButton = (OvalButton) aVar.findViewById(R.id.primaryButton);
        final AtomicInteger atomicInteger = new AtomicInteger(i2);
        ovalButton.setOnClickListener(new fg(atomicInteger, ovalButton, i3, i4, aVar, 0));
        if (j2 > 0) {
            ovalButton.z((int) j2);
        }
        OvalButton ovalButton2 = (OvalButton) aVar.findViewById(R.id.secondaryButton);
        View viewFindViewById = aVar.findViewById(R.id.confirmCloseTextButtonSeparator);
        TextView textView = (TextView) aVar.findViewById(R.id.confirmCloseTextButton);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.waze.fk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageBoxNativeManager.lambda$openChoiceBottomDialog$2(atomicInteger, i5, aVar, view);
            }
        };
        if (z) {
            ovalButton2.setVisibility(8);
            viewFindViewById.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(str4);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setOnClickListener(onClickListener);
        } else {
            ovalButton2.setVisibility(0);
            viewFindViewById.setVisibility(8);
            textView.setVisibility(8);
            ((TextView) aVar.findViewById(R.id.secondaryButtonLabel)).setText(str4);
            ovalButton2.setOnClickListener(onClickListener);
        }
        aVar.show();
        return new com.waze.app_nav.hub.b.h(aVar, new h.g.a.a() { // from class: com.waze.fl
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f23903a.lambda$openChoiceBottomDialog$3(ovalButton, atomicInteger, j3, j4);
            }
        });
    }

    static /* synthetic */ void lambda$openChoiceBottomDialog$1(AtomicInteger atomicInteger, OvalButton ovalButton, int i2, int i3, com.waze.sharedui.d.a aVar, View view) {
        if (true != ovalButton.D()) {
            i2 = i3;
        }
        atomicInteger.set(i2);
        aVar.dismiss();
    }

    static /* synthetic */ void lambda$openChoiceBottomDialog$2(AtomicInteger atomicInteger, int i2, com.waze.sharedui.d.a aVar, View view) {
        atomicInteger.set(i2);
        aVar.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h.ab lambda$openChoiceBottomDialog$3(OvalButton ovalButton, AtomicInteger atomicInteger, long j2, long j3) {
        ovalButton.A();
        ConfirmDialogCallback(atomicInteger.get(), j2, j3, -1L);
        return h.ab.f48028a;
    }

    static /* synthetic */ com.waze.app_nav.hub.b.i lambda$openChoiceDialog$0(boolean z, String str, String str2, String str3, String str4, int i2, final boolean z2, final boolean z3, final fq fqVar, final int i3, final int i4, final int i5, String str5, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.R(z);
        oVar.Q(str);
        oVar.P(str2);
        oVar.M(str3);
        oVar.N(str4);
        oVar.w(i2);
        oVar.C(z2);
        oVar.I(new com.waze.ab.p() { // from class: com.waze.fi
            @Override // com.waze.ab.p
            public final void a(DialogInterface dialogInterface, boolean z4) {
                MessageBoxNativeManager.lambda$openChoiceDialog$1(z3, fqVar, i3, z2, i4, i5, dialogInterface, z4);
            }
        });
        oVar.J(new com.waze.ab.r() { // from class: com.waze.fj
            @Override // com.waze.ab.r
            public final void a(boolean z4, boolean z5) {
                MessageBoxNativeManager.lambda$openChoiceDialog$2(fqVar, i4, i5, z4, z5);
            }
        });
        if (!TextUtils.isEmpty(str5)) {
            int iG = com.waze.resources.h.g(str5.toLowerCase());
            if (iG != 0) {
                oVar.F(iG);
            } else {
                oVar.E(ResourcesNativeManager.getInstance().getSkinDrawable(context.getResources(), "enc/".concat(String.valueOf(str5.toLowerCase()))));
            }
        }
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    static /* synthetic */ void lambda$openChoiceDialog$1(boolean z, fq fqVar, int i2, boolean z2, int i3, int i4, DialogInterface dialogInterface, boolean z3) {
        if (z) {
            fqVar.a(i2);
        } else if (z2) {
            fqVar.a(i3);
        } else {
            fqVar.a(i4);
        }
    }

    static /* synthetic */ void lambda$openChoiceDialog$2(fq fqVar, int i2, int i3, boolean z, boolean z2) {
        if (z) {
            fqVar.a(i2);
        } else {
            fqVar.a(i3);
        }
    }

    private void openChoiceBottomDialog(final String str, final String str2, final String str3, final int i2, final String str4, final int i3, final long j2, final int i4, final int i5, final boolean z, final long j3, final long j4) {
        showDialog(OPEN_CHOICE_BOTTOM_DIALOG_POPUP_TAG, new com.waze.app_nav.hub.b.j() { // from class: com.waze.fh
            @Override // com.waze.app_nav.hub.b.j
            public final com.waze.app_nav.hub.b.i create(Context context) {
                return this.f23879a.lambda$openChoiceBottomDialog$0(str, str2, str3, i5, i4, i2, j2, i3, z, str4, j3, j4, context);
            }
        });
    }

    private void openChoiceDialog(final String str, final String str2, final boolean z, final boolean z2, final int i2, final fq fqVar, final String str3, final int i3, final String str4, final int i4, final int i5, final String str5, final boolean z3) {
        showDialog(OPEN_CHOICE_DIALOG_POPUP_TAG, new com.waze.app_nav.hub.b.j() { // from class: com.waze.fn
            @Override // com.waze.app_nav.hub.b.j
            public final com.waze.app_nav.hub.b.i create(Context context) {
                return MessageBoxNativeManager.lambda$openChoiceDialog$0(z3, str, str2, str3, str4, i5, z2, z, fqVar, i2, i3, i4, str5, context);
            }
        });
    }

    private void showDialog(String str, com.waze.app_nav.hub.b.j jVar) {
        com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k(str, jVar));
    }

    protected native void ConfirmDialogCallbackNTV(int i2, long j2, long j3, long j4);

    protected native void MsgBoxCallbackNTV(long j2);

    void OpenChoiceBottomDialogCb(String str, String str2, String str3, int i2, String str4, int i3, long j2, int i4, int i5, boolean z, long j3, long j4) {
        openChoiceBottomDialog(str, str2, str3, i2, str4, i3, j2, i4, i5, z, j3, j4);
    }

    void OpenConfirmDialogCustomTimeoutCb(String str, String str2, boolean z, long j2, long j3, String str3, String str4, int i2, String str5, boolean z2, boolean z3) {
        openChoiceDialog(str, str2, false, z, true != z ? 4 : 3, new fp(this, j2, j3, 2), true != z2 ? str3 : str4, true != z2 ? 3 : 4, true == z2 ? str3 : str4, true != z2 ? 4 : 3, i2, str5, z3);
    }

    void OpenMessageBoxTimeoutCb(final String str, final String str2, final String str3, final int i2, final long j2) {
        showDialog(OPEN_MESSAGE_BOX_TIMEOUT_CB_POPUP_TAG, new com.waze.app_nav.hub.b.j() { // from class: com.waze.fo
            @Override // com.waze.app_nav.hub.b.j
            public final com.waze.app_nav.hub.b.i create(Context context) {
                return this.f23922a.lambda$OpenMessageBoxTimeoutCb$0(str, str2, str3, i2, j2, context);
            }
        });
    }

    void OpenSubmitLogsDialog() {
        com.waze.ab.ab.c();
    }

    void ShowAddSecondStopDialog(long j2, long j3) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        openChoiceDialog(aVarA.c(R.string.STOP_POINT_QUESTION_REPLACE_TITLE, new Object[0]), aVarA.c(R.string.STOP_POINT_QUESTION_REPLACE_LABEL, new Object[0]), true, true, 2, new fp(this, j2, j3, 0), aVarA.c(R.string.STOP_POINT_QUESTION_NEW, new Object[0]), 4, aVarA.c(R.string.STOP_POINT_QUESTION_CANCEL, new Object[0]), 2, -1, null, false);
    }

    void ShowCallbackTechCodePopup(String str, String str2, long j2) {
        ((kd) com.waze.web.r.h(kd.class)).e(new jn(str, str2, j2));
    }

    void ShowLogsReportedDialog(boolean z) {
        ((kd) com.waze.web.r.h(kd.class)).e(new jr(z));
    }

    void ShowRouteCalculationError(String str, String str2, int i2) {
        ((kd) com.waze.web.r.h(kd.class)).e(new js(str, str2, i2));
    }

    void ShowRoutingResponseError(int i2, String str, String str2, int i3) {
        ((kd) com.waze.web.r.h(kd.class)).e(new ju(i2, str, str2, i3));
    }

    void ShowTechCodePopup(String str, String str2) {
        ((kd) com.waze.web.r.h(kd.class)).e(new jx(str, str2, com.waze.app_nav.hub.b.a.f15254a));
    }

    void ShowViaDangerZoneWarningDialog(int i2, long j2, long j3) {
        ((kd) com.waze.web.r.h(kd.class)).e(new jz(DriveTo.DangerZoneType.forNumber(i2), new fp(this, j2, j3, 1)));
    }

    public native void initNativeLayerNTV();
}
