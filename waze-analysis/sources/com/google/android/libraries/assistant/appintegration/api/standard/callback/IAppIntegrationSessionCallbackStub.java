package com.google.android.libraries.assistant.appintegration.api.standard.callback;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager$KeyguardDismissCallback;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import com.google.android.apps.search.assistant.platform.appintegration.a.b;
import com.google.android.libraries.assistant.appintegration.Callback;
import com.google.android.libraries.assistant.appintegration.CallbackExt;
import com.google.android.libraries.assistant.appintegration.proto.AssistantConversationState;
import com.google.android.libraries.assistant.appintegration.proto.KeyguardDismissStatus;
import com.google.android.libraries.assistant.appintegration.proto.VoicePlateStateChangedParams;
import com.google.android.libraries.assistant.appintegration.shared.AssistantConstants;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback;
import com.google.android.libraries.assistant.appintegration.shared.proto.AppIntegrationService;
import com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEvent;
import com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEventData;
import com.google.android.libraries.assistant.appintegration.shared.proto.VoicePlateStateChangedEvent;
import com.google.android.libraries.assistant.appintegration.shared.util.ExtensionRegistryUtils;
import com.google.d.b.aa;
import com.google.d.m.a.bv;
import com.google.v.de;
import com.google.v.eu;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class IAppIntegrationSessionCallbackStub extends IAppIntegrationSessionCallback.Stub implements b {
    private static final String TAG = "AIClientCbStub";
    protected Callback callback;
    private final de extensionRegistry;
    private boolean isMorrisVoicePlateOpened;
    private KeyguardManager$KeyguardDismissCallback keyguardDismissCallback;
    private KeyguardDismissStatusListener keyguardDismissStatusListener;
    SystemUiManager systemUiManager;
    private final Handler handler = new Handler(Looper.getMainLooper());
    aa<Runnable> resetStatesTask = aa.g();
    protected bv<AssistantConstants.Done> navigationStateChangeComplete = bv.f();

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId;

        static {
            int[] iArr = new int[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.values().length];
            $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId = iArr;
            try {
                iArr[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.VOICE_PLATE_STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.ASSISTANT_CONNECTION_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.ASSISTANT_CONVERSATION_STATE_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.REQUEST_DISMISS_KEYGUARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.NAVIGATION_STATE_CHANGE_COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.VOICE_PLATE_OPENED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$android$libraries$assistant$appintegration$shared$proto$AppIntegrationService$AppIntegrationCallbackEvent$CallbackEventId[AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.VOICE_PLATE_CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public interface KeyguardDismissStatusListener {
        void onKeyguardDismissStatusChanged(KeyguardDismissStatus keyguardDismissStatus);
    }

    public IAppIntegrationSessionCallbackStub(Context context) {
        this.systemUiManager = new SystemUiManager(context);
        this.navigationStateChangeComplete.c(AssistantConstants.Done.DONE);
        this.extensionRegistry = ExtensionRegistryUtils.getRegistry();
    }

    private void handleVoicePlateStateChangedEvent(VoicePlateStateChangedParams voicePlateStateChangedParams) {
        Log.d(TAG, "VOICE_PLATE_STATE ".concat(String.valueOf(String.valueOf(voicePlateStateChangedParams.getVoicePlateState()))));
        CallbackExt callbackExt = (CallbackExt) this.callback;
        VoicePlateStateChangedParams.VoicePlateState voicePlateState = voicePlateStateChangedParams.getVoicePlateState();
        VoicePlateStateChangedParams.VoicePlateState voicePlateState2 = VoicePlateStateChangedParams.VoicePlateState.VOICE_PLATE_STATE_OPENED;
        VoicePlateStateChangedParams.VoicePlateState voicePlateState3 = voicePlateStateChangedParams.getVoicePlateState();
        VoicePlateStateChangedParams.VoicePlateState voicePlateState4 = VoicePlateStateChangedParams.VoicePlateState.VOICE_PLATE_STATE_CLOSED;
        if (voicePlateStateChangedParams.getVoicePlateMode() != VoicePlateStateChangedParams.VoicePlateMode.VOICE_PLATE_MODE_MORRIS) {
            if (voicePlateState3 == voicePlateState4) {
                callbackExt.onAssistantConversationStateChanged(AssistantConversationState.ASSISTANT_CONVERSATION_STATE_COMPLETED);
            }
            callbackExt.onVoicePlateStateChanged(voicePlateStateChangedParams);
            if (voicePlateState == voicePlateState2) {
                callbackExt.onAssistantConversationStateChanged(AssistantConversationState.ASSISTANT_CONVERSATION_STATE_STARTED);
                return;
            }
            return;
        }
        if (this.resetStatesTask.f()) {
            this.handler.removeCallbacks((Runnable) this.resetStatesTask.b());
            this.resetStatesTask = aa.g();
        }
        if (voicePlateState == voicePlateState2) {
            this.systemUiManager.adjustSystemNavigationUi(voicePlateStateChangedParams.getHideSystemNavigationBar());
            if (!this.isMorrisVoicePlateOpened) {
                this.isMorrisVoicePlateOpened = true;
            }
        } else if (this.isMorrisVoicePlateOpened) {
            this.systemUiManager.reinstateSystemUi();
            this.isMorrisVoicePlateOpened = false;
        }
        callbackExt.onVoicePlateStateChanged(voicePlateStateChangedParams);
    }

    private void onUpdateInternal(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
        CallbackExt callbackExt = (CallbackExt) this.callback;
        AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId callbackEventId = appIntegrationCallbackEvent.getCallbackEventId();
        AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId callbackEventId2 = AppIntegrationService.AppIntegrationCallbackEvent.CallbackEventId.UNKNOWN;
        switch (callbackEventId.ordinal()) {
            case 1:
                Log.v(TAG, "#onUpdate(): VOICE_PLATE_OPENED");
                callbackExt.onVoicePlateOpened();
                break;
            case 2:
                Log.v(TAG, "#onUpdate(): VOICE_PLATE_CLOSED");
                callbackExt.onVoicePlateClosed();
                break;
            case 3:
                Log.i(TAG, "#onUpdate(): VOICE_PLATE_STATE_CHANGED");
                if (!appIntegrationCallbackEvent.hasExtension(VoicePlateStateChangedEvent.voicePlateStateChangedParams)) {
                    Log.w(TAG, String.format("#onUpdate(): extension not set for VOICE_PLATE_STATE_CHANGED event: %s", appIntegrationCallbackEvent));
                    break;
                } else {
                    handleVoicePlateStateChangedEvent((VoicePlateStateChangedParams) appIntegrationCallbackEvent.getExtension(VoicePlateStateChangedEvent.voicePlateStateChangedParams));
                    break;
                }
            case 4:
            case 5:
            default:
                Log.w(TAG, String.format("#onUpdate(): unrecognized callback event: %d", Integer.valueOf(callbackEventId.getNumber())));
                break;
            case 6:
                Log.v(TAG, "#onUpdate(): ASSISTANT_CONNECTION_LOST");
                lambda$resetStatesDelayed$0();
                callbackExt.onAssistantConnectionLost();
                break;
            case 7:
                Log.v(TAG, "#onUpdate(): ASSISTANT_CONVERSATION_STATE_CHANGED");
                if (!appIntegrationCallbackEvent.hasExtension(AssistantConversationStateChangedEvent.assistantConversationStateChangedEventData)) {
                    Log.w(TAG, "#onUpdate(): extension not set for ASSISTANT_CONVERSATION_STATE_CHANGED event.");
                    break;
                } else {
                    callbackExt.onAssistantConversationStateChanged(((AssistantConversationStateChangedEventData) appIntegrationCallbackEvent.getExtension(AssistantConversationStateChangedEvent.assistantConversationStateChangedEventData)).getAssistantConversationState());
                    break;
                }
            case 8:
                Log.v(TAG, "#onUpdate(): REQUEST_DISMISS_KEYGUARD");
                if (!getActivityOptional().f()) {
                    Log.w(TAG, "#onUpdate(): REQUEST_DISMISS_KEYGUARD - no registered activity.");
                    break;
                } else {
                    KeyguardManager keyguardManager = (KeyguardManager) ((Activity) getActivityOptional().b()).getSystemService("keyguard");
                    if (this.keyguardDismissCallback == null) {
                        this.keyguardDismissCallback = new KeyguardManager$KeyguardDismissCallback(this) { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub.1
                            final /* synthetic */ IAppIntegrationSessionCallbackStub this$0;

                            {
                                Objects.requireNonNull(this);
                                this.this$0 = this;
                            }

                            public void onDismissCancelled() {
                                Log.v(IAppIntegrationSessionCallbackStub.TAG, "KeyguardDismissCallback#onDismissCancelled()");
                                if (this.this$0.keyguardDismissStatusListener != null) {
                                    this.this$0.keyguardDismissStatusListener.onKeyguardDismissStatusChanged(KeyguardDismissStatus.KEYGUARD_DISMISS_STATUS_CANCELLED);
                                }
                            }

                            public void onDismissError() {
                                Log.v(IAppIntegrationSessionCallbackStub.TAG, "KeyguardDismissCallback#onDismissError()");
                                if (this.this$0.keyguardDismissStatusListener != null) {
                                    this.this$0.keyguardDismissStatusListener.onKeyguardDismissStatusChanged(KeyguardDismissStatus.KEYGUARD_DISMISS_STATUS_ERROR);
                                }
                            }

                            public void onDismissSucceeded() {
                                Log.v(IAppIntegrationSessionCallbackStub.TAG, "KeyguardDismissCallback#onDismissSucceeded()");
                                if (this.this$0.keyguardDismissStatusListener != null) {
                                    this.this$0.keyguardDismissStatusListener.onKeyguardDismissStatusChanged(KeyguardDismissStatus.KEYGUARD_DISMISS_STATUS_SUCCEEDED);
                                }
                            }
                        };
                    }
                    keyguardManager.requestDismissKeyguard((Activity) getActivityOptional().b(), this.keyguardDismissCallback);
                    break;
                }
            case 9:
                Log.v(TAG, "#onUpdate(): NAVIGATION_STATE_CHANGE_COMPLETE");
                this.navigationStateChangeComplete.c(AssistantConstants.Done.DONE);
                break;
        }
    }

    public aa<Activity> getActivityOptional() {
        return this.systemUiManager.getActivityOptional();
    }

    public Callback getCallback() {
        return this.callback;
    }

    public bv<AssistantConstants.Done> getNavigationStateChangeComplete() {
        return this.navigationStateChangeComplete;
    }

    public aa<Window> getPopupWindowOptional() {
        return this.systemUiManager.getPopupWindowOptional();
    }

    public boolean isMorrisVoicePlateOpened() {
        return this.isMorrisVoicePlateOpened;
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.b
    public void onServiceConnected() {
        this.callback.onServiceConnected();
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.b
    public void onServiceDisconnected() {
        this.callback.onServiceDisconnected();
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback
    public void onUpdate(byte[] bArr) {
        Log.i(TAG, "#onUpdate()");
        Callback callback = this.callback;
        if (!(callback instanceof CallbackExt)) {
            Log.w(TAG, String.format("callback is not an instance of CallbackExt: %s", callback));
            return;
        }
        try {
            onUpdateInternal(AppIntegrationService.AppIntegrationCallbackEvent.parseFrom(bArr, this.extensionRegistry));
        } catch (eu unused) {
            Log.w(TAG, "#onUpdate(): failed to parse bytes to AppIntegrationCallbackEvent");
        }
    }

    public void resetNavigationStateChangeComplete() {
        if (!this.navigationStateChangeComplete.isDone()) {
            Log.w(TAG, "#resetNavigationStateChangeComplete(): cancelled in-progress state change.");
            this.navigationStateChangeComplete.cancel(true);
        }
        this.navigationStateChangeComplete = bv.f();
    }

    /* renamed from: resetStates, reason: merged with bridge method [inline-methods] */
    public void lambda$resetStatesDelayed$0() {
        Log.v(TAG, "#resetStates(): isMorrisVoicePlateOpened = %b " + this.isMorrisVoicePlateOpened);
        if (this.resetStatesTask.f()) {
            this.handler.removeCallbacks((Runnable) this.resetStatesTask.b());
            this.resetStatesTask = aa.g();
        }
        if (this.isMorrisVoicePlateOpened) {
            this.systemUiManager.reinstateSystemUi();
            this.isMorrisVoicePlateOpened = false;
        }
    }

    public void resetStatesDelayed(long j2) {
        Log.v(TAG, "#resetStatesDelayed(): isMorrisVoicePlateOpened = %b " + this.isMorrisVoicePlateOpened);
        if (this.isMorrisVoicePlateOpened) {
            aa<Runnable> aaVarI = aa.i(new Runnable() { // from class: com.google.android.libraries.assistant.appintegration.api.standard.callback.IAppIntegrationSessionCallbackStub$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$resetStatesDelayed$0();
                }
            });
            this.resetStatesTask = aaVarI;
            this.handler.postDelayed((Runnable) aaVarI.b(), j2);
        }
    }

    public void setActivityOptional(aa<Activity> aaVar) {
        Log.d(TAG, String.format("#setActivityOptional(): isMorrisVoicePlateOpened = %b", Boolean.valueOf(this.isMorrisVoicePlateOpened)));
        if (this.isMorrisVoicePlateOpened) {
            this.systemUiManager.reinstateActivitySystemUi();
        }
        this.systemUiManager.setActivityOptional(aaVar);
        if (this.isMorrisVoicePlateOpened) {
            this.systemUiManager.updateActivitySystemUi();
        }
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setKeyguardDismissStatusListener(KeyguardDismissStatusListener keyguardDismissStatusListener) {
        this.keyguardDismissStatusListener = keyguardDismissStatusListener;
    }

    public void setPopupWindowOptional(aa<Window> aaVar) {
        Log.v(TAG, String.format("#setPopupWindowOptional(): isMorrisVoicePlateOpened = %b", Boolean.valueOf(this.isMorrisVoicePlateOpened)));
        if (this.isMorrisVoicePlateOpened) {
            this.systemUiManager.reinstatePopupWindowSystemUi();
        }
        this.systemUiManager.setPopupWindowOptional(aaVar);
        if (this.isMorrisVoicePlateOpened) {
            this.systemUiManager.updatePopupWindowSystemUi();
        }
    }

    @Override // com.google.android.apps.search.assistant.platform.appintegration.a.b
    public void onUpdate(AppIntegrationService.AppIntegrationCallbackEvent appIntegrationCallbackEvent) {
        Log.d(TAG, "#onUpdate()");
        Callback callback = this.callback;
        if (!(callback instanceof CallbackExt)) {
            Log.w(TAG, String.format("callback is not an instance of CallbackExt: %s", callback));
        } else {
            onUpdateInternal(appIntegrationCallbackEvent);
        }
    }
}
