package com.waze.google_assistant;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;
import com.waze.settings.SettingsNativeManager;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aw extends com.waze.sharedui.d.a implements RecognitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SpeechRecognizerActivity f24118a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f24119b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f24120c;

    /* renamed from: d, reason: collision with root package name */
    private View f24121d;

    /* renamed from: e, reason: collision with root package name */
    private View f24122e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f24123f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24124g;

    /* renamed from: h, reason: collision with root package name */
    private String f24125h;

    /* renamed from: i, reason: collision with root package name */
    private final int f24126i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(SpeechRecognizerActivity speechRecognizerActivity, Context context) {
        super(context);
        Objects.requireNonNull(speechRecognizerActivity);
        this.f24118a = speechRecognizerActivity;
        this.f24124g = false;
        this.f24125h = null;
        this.f24126i = speechRecognizerActivity.getResources().getColor(R.color.content_default);
    }

    public static /* synthetic */ void a(aw awVar, ValueAnimator valueAnimator) {
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        awVar.f24121d.setScaleX(f2.floatValue());
        awVar.f24121d.setScaleY(f2.floatValue());
    }

    static /* bridge */ /* synthetic */ void b(final aw awVar) {
        awVar.f24125h = null;
        SpeechRecognizerActivity speechRecognizerActivity = awVar.f24118a;
        awVar.m(speechRecognizerActivity.f24056l.c(speechRecognizerActivity.f24055k != null ? speechRecognizerActivity.f24055k.intValue() : R.string.DICTATION_BOTTOM_SHEET_START_LISTENING_SEARCH, new Object[0]));
        awVar.f24119b.setTextColor(awVar.f24126i);
        awVar.f24123f.setImageResource(R.drawable.mic_active_ic);
        awVar.f24120c.setVisibility(0);
        awVar.f24122e.setVisibility(8);
        awVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.waze.google_assistant.ap
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SpeechRecognizerActivity.p(this.f24110a.f24118a);
            }
        });
    }

    public static /* synthetic */ void f(aw awVar) {
        if (awVar.f24119b.getLineCount() > 2) {
            String string = awVar.f24119b.getText().toString();
            int lineStart = awVar.f24119b.getLayout().getLineStart(awVar.f24119b.getLineCount() - 2) + 3;
            if (lineStart >= string.length()) {
                return;
            }
            String strSubstring = string.substring(lineStart);
            int iIndexOf = strSubstring.indexOf(32);
            if (iIndexOf != -1) {
                awVar.f24119b.setText(TextUtils.concat("...", strSubstring.substring(iIndexOf)));
            } else {
                awVar.f24119b.setText(TextUtils.concat("...", strSubstring));
            }
        }
    }

    public static /* synthetic */ void h(aw awVar) {
        p(com.waze.sound.f.b.f39979c);
        awVar.f24118a.y();
    }

    private final void k(float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24121d.getScaleX(), f2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.waze.google_assistant.ao
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                aw.a(this.f24109a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new av(this));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        dismiss();
        com.waze.sound.f.b bVar = com.waze.sound.f.b.f39978b;
        p(bVar);
        com.waze.bs.a.e(this.f24118a, "settings_main.voice.voice_commands.search_by_voice", bVar.toString());
    }

    private final void m(String str) {
        this.f24119b.setText(str);
    }

    private static final String n(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return null;
        }
        return stringArrayList.get(0);
    }

    private static final void o(com.waze.sound.f.c cVar) {
        com.waze.sharedui.utils.o.c().b(cVar);
    }

    private static final void p(com.waze.sound.f.b bVar) {
        com.waze.sharedui.utils.o.c().a(bVar, aa.f24060a.a().D());
    }

    @Override // com.waze.sharedui.d.a
    protected final void e() {
        cancel();
        p(com.waze.sound.f.b.f39977a);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        p(com.waze.sound.f.b.f39977a);
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        m(this.f24118a.f24056l.c(R.string.DICTATION_BOTTOM_SHEET_BEGINNING_OF_SPEECH, new Object[0]));
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // com.waze.sharedui.d.a, android.support.v7.app.ap, androidx.activity.ComponentDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.speech_recognizer_bottom_sheet);
        u(findViewById(R.id.dictationDialogMainContainer));
        this.f24121d = findViewById(R.id.volumeCircleView);
        this.f24123f = (ImageView) findViewById(R.id.dictationDialogImage);
        this.f24120c = (TextView) findViewById(R.id.dictationSubtitle);
        String currentVoiceSearchLabel = ((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).getCurrentVoiceSearchLabel();
        boolean zIsEmpty = TextUtils.isEmpty(currentVoiceSearchLabel);
        TextView textView = this.f24120c;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            this.f24120c.setText(currentVoiceSearchLabel);
            this.f24120c.setOnClickListener(new View.OnClickListener() { // from class: com.waze.google_assistant.as
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24114a.l();
                }
            });
            this.f24120c.setVisibility(0);
        }
        TextView textView2 = (TextView) findViewById(R.id.dictationDialogTitle);
        this.f24119b = textView2;
        textView2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.waze.google_assistant.at
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                aw.f(this.f24115a);
                return true;
            }
        });
        ((TextView) findViewById(R.id.dictationTryAgainButtonText)).setText(this.f24118a.f24056l.c(R.string.DICTATION_BOTTOM_SHEET_TRY_AGAIN, new Object[0]));
        View viewFindViewById = findViewById(R.id.dictationTryAgainButton);
        this.f24122e = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.waze.google_assistant.au
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aw.h(this.f24116a);
            }
        });
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i2) {
        k(0.0f);
        this.f24123f.setImageResource(R.drawable.dictation_error_icon);
        this.f24120c.setVisibility(8);
        this.f24122e.setVisibility(0);
        SpeechRecognizerActivity speechRecognizerActivity = this.f24118a;
        this.f24119b.setTextColor(speechRecognizerActivity.getResources().getColor(R.color.alarming));
        if (i2 == 1 || i2 == 2) {
            o(com.waze.sound.f.c.f39982b);
            this.f24119b.setText(speechRecognizerActivity.f24056l.c(R.string.DICTATION_BOTTOM_SHEET_NETWORK_ERROR, new Object[0]));
            return;
        }
        if (i2 == 6) {
            o(com.waze.sound.f.c.f39985e);
            this.f24119b.setText(speechRecognizerActivity.f24056l.c(R.string.DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, new Object[0]));
        } else if (i2 == 7) {
            o(com.waze.sound.f.c.f39983c);
            this.f24119b.setText(speechRecognizerActivity.f24056l.c(R.string.DICTATION_BOTTOM_SHEET_NO_MATCH, new Object[0]));
        } else if (i2 != 9) {
            o(com.waze.sound.f.c.f39986f);
            this.f24119b.setText(speechRecognizerActivity.f24056l.c(R.string.DICTATION_BOTTOM_SHEET_UNKNOWN_ERROR, new Object[0]));
        } else {
            o(com.waze.sound.f.c.f39984d);
            speechRecognizerActivity.w();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i2, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        String strN = n(bundle);
        if (strN == null || strN.length() <= 0) {
            return;
        }
        String str = this.f24125h;
        if (str == null || strN.length() >= str.length()) {
            SpannableString spannableString = new SpannableString(strN);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f24126i);
            String str2 = this.f24125h;
            spannableString.setSpan(foregroundColorSpan, 0, str2 == null ? 0 : str2.length(), 33);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(this.f24118a.getResources().getColor(R.color.content_p3));
            String str3 = this.f24125h;
            spannableString.setSpan(foregroundColorSpan2, str3 != null ? str3.length() : 0, strN.length(), 33);
            this.f24119b.setText(spannableString);
            this.f24125h = strN;
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        SpeechRecognizerActivity speechRecognizerActivity = this.f24118a;
        m(speechRecognizerActivity.f24056l.c(speechRecognizerActivity.f24055k != null ? speechRecognizerActivity.f24055k.intValue() : R.string.DICTATION_BOTTOM_SHEET_START_LISTENING_SEARCH, new Object[0]));
        this.f24119b.setTextColor(this.f24126i);
        this.f24123f.setImageResource(R.drawable.mic_active_ic);
        this.f24120c.setOnClickListener(new View.OnClickListener() { // from class: com.waze.google_assistant.aq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24111a.l();
            }
        });
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        String str;
        o(com.waze.sound.f.c.f39981a);
        k(0.0f);
        final ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        String strN = n(bundle);
        if (TextUtils.isEmpty(strN) && (str = this.f24125h) != null) {
            this.f24119b.setText(str);
        } else if (!TextUtils.isEmpty(strN)) {
            this.f24119b.setText(strN);
        }
        this.f24119b.setTextColor(this.f24126i);
        this.f24123f.setImageResource(R.drawable.dictation_confirmation_ic);
        this.f24118a.aG(new Runnable() { // from class: com.waze.google_assistant.ar
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = new Intent();
                intent.putExtra("android.speech.extra.RESULTS", stringArrayList);
                aw awVar = this.f24112a;
                SpeechRecognizerActivity speechRecognizerActivity = awVar.f24118a;
                speechRecognizerActivity.setResult(-1, intent);
                if (speechRecognizerActivity.isFinishing()) {
                    return;
                }
                awVar.dismiss();
            }
        }, 1500L);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f2) {
        float fMin = Math.min(10.0f, Math.max(0.0f, f2)) * 0.75f;
        if (this.f24124g) {
            return;
        }
        float f3 = (fMin / 10.0f) + 1.0f;
        if (this.f24121d.getScaleX() != f3) {
            this.f24124g = true;
            k(f3);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        com.waze.sharedui.utils.o.c().c();
    }
}
