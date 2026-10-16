package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.Random;

/* loaded from: classes.dex */
public final class kyf implements nfz {
    private static final yph a = yph.c("GH.AsstQFEPvdr");
    private final ngf b;
    private final Context c;
    private final Random d;

    public kyf(ngf ngfVar, Context context) {
        Random random = new Random();
        this.b = ngfVar;
        this.c = context;
        this.d = random;
    }

    public static final void c(yzy yzyVar) {
        osv osvVar;
        if (yzyVar == yzy.FQ) {
            osvVar = osv.ASSISTANT_THUMBS_UP_FEEDBACK_CLICKED;
        } else {
            if (yzyVar != yzy.FP) {
                ((ype) ((ype) a.h()).ai((char) 3540)).u("Unexpected action after TU/TD result");
                return;
            }
            osvVar = osv.ASSISTANT_THUMBS_DOWN_FEEDBACK_CLICKED;
        }
        kwv kwvVarH = kfl.h();
        abnp abnpVarN = osw.a.n();
        abnpVarN.t();
        osw oswVar = (osw) abnpVarN.b;
        oswVar.c = osvVar.C;
        oswVar.b |= 1;
        kwvVarH.v((osw) abnpVarN.q());
    }

    public static final void d(yzy yzyVar) {
        osv osvVar;
        if (yzyVar == yzy.FQ) {
            osvVar = osv.GEMINI_THUMBS_UP_FEEDBACK_CLICKED;
        } else {
            if (yzyVar != yzy.FP) {
                ((ype) ((ype) a.h()).ai((char) 3541)).u("Unexpected action after TU/TD result");
                return;
            }
            osvVar = osv.GEMINI_THUMBS_DOWN_FEEDBACK_CLICKED;
        }
        kwv kwvVarH = kfl.h();
        abnp abnpVarN = osw.a.n();
        abnpVarN.t();
        osw oswVar = (osw) abnpVarN.b;
        oswVar.c = osvVar.C;
        oswVar.b |= 1;
        kwvVarH.v((osw) abnpVarN.q());
    }

    private static final double e(nga ngaVar) {
        return ((ngaVar instanceof nft) || ngaVar == ngb.o) ? acmd.b() : acmd.f();
    }

    private static final boolean f(nga ngaVar) {
        return ((ngaVar instanceof nft) || ngaVar == ngb.o) ? acmd.r() : acmd.B();
    }

    @Override // defpackage.nfz
    public final /* bridge */ /* synthetic */ nge a(nga ngaVar) {
        int i;
        ngb ngbVar = ngb.o;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = ngaVar == ngb.l || ngaVar == ngb.m || ngaVar == ngb.n;
        boolean z2 = ngaVar instanceof nft;
        boolean z3 = ngaVar == ngbVar;
        if (!z2 && !z3 && !z) {
            return null;
        }
        if (this.d.nextDouble() > e(ngaVar)) {
            ((ype) ((ype) a.f()).ai((char) 3539)).y("Assistant Quick Feedback not triggered at rate. %f", Double.valueOf(e(ngaVar)));
            return null;
        }
        if (f(ngaVar)) {
            ngf ngfVar = this.b;
            if (ngfVar.a() <= ngfVar.n()) {
                ((ype) ((ype) a.f()).ai((char) 3538)).u("Assistant Quick Feedback throttled.");
                return null;
            }
        }
        ((ype) ((ype) a.f()).ai((char) 3537)).y("Assistant Quick Feedback triggered. isThrottlingEnabled %b", Boolean.valueOf(f(ngaVar)));
        boolean zB = ldz.a().b();
        String str = RemoteApiConstants.NOW_PACKAGE;
        if (z3) {
            i = true == zB ? R.drawable.product_logo_gemini_2025_color_48_inset : 2131233027;
            boolean zAS = acxa.aS();
            Context context = this.c;
            return zAS ? new nvm(R.string.assistant_summarization_quick_feedback_prompt, 0, lnm.F(context, i, false), yzz.CSAT_MESSAGE_SUMMARIZATION, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), null) : new nvm(context, R.string.assistant_summarization_quick_feedback_prompt, 0, "Assistant Quick Feedback Notification", GhIcon.p(context, i), yzz.CSAT_MESSAGE_SUMMARIZATION, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), null);
        }
        if (z2) {
            boolean zAS2 = acxa.aS();
            Context context2 = this.c;
            return zAS2 ? new nvm(R.string.assistant_summarization_quick_feedback_prompt, 0, lnm.F(context2, R.drawable.ic_assistant_logo, false), yzz.CSAT_MESSAGE_SUMMARIZATION, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), null) : new nvm(context2, R.string.assistant_summarization_quick_feedback_prompt, 0, "Assistant Quick Feedback Notification", GhIcon.p(context2, R.drawable.ic_assistant_logo), yzz.CSAT_MESSAGE_SUMMARIZATION, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), null);
        }
        if (ngaVar == ngb.m) {
            i = true == zB ? R.drawable.product_logo_gemini_2025_color_48_inset : 2131233027;
            String str2 = kzj.a().b;
            if (str2 != null) {
                str = str2;
            }
            boolean zAS3 = acxa.aS();
            Context context3 = this.c;
            return zAS3 ? new nvm(R.string.gemini_quick_feedback_prompt, 0, lnm.F(context3, i, false), yzz.CSAT_GEMINI, new ComponentName(str, "CarAssistantQuickFeedbackProvider"), new nvo(this) { // from class: kye
                public final /* synthetic */ kyf a;

                {
                    this.a = this;
                }

                @Override // defpackage.nvo
                public final void a(yzy yzyVar) {
                    int i4 = i3;
                    if (i4 == 0) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i4 == 1) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i4 == 2) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i4 == 3) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i4 != 4) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    } else {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    }
                }
            }) : new nvm(context3, R.string.gemini_quick_feedback_prompt, 0, "Assistant Quick Feedback Notification", GhIcon.p(context3, i), yzz.CSAT_GEMINI, new ComponentName(str, "CarAssistantQuickFeedbackProvider"), new nvo(this) { // from class: kye
                public final /* synthetic */ kyf a;

                {
                    this.a = this;
                }

                @Override // defpackage.nvo
                public final void a(yzy yzyVar) {
                    int i4 = i2;
                    if (i4 == 0) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i4 == 1) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i4 == 2) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i4 == 3) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i4 != 4) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    } else {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    }
                }
            });
        }
        if (ngaVar != ngb.n) {
            boolean zAS4 = acxa.aS();
            Context context4 = this.c;
            if (zAS4) {
                final int i4 = 4;
                return new nvm(R.string.assistant_quick_feedback_prompt, 0, lnm.F(context4, R.drawable.ic_assistant_logo, false), yzz.CSAT_ASSISTANT, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), new nvo(this) { // from class: kye
                    public final /* synthetic */ kyf a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.nvo
                    public final void a(yzy yzyVar) {
                        int i42 = i4;
                        if (i42 == 0) {
                            if (yzyVar == yzy.FP) {
                                this.a.b();
                            }
                            kyf.d(yzyVar);
                            return;
                        }
                        if (i42 == 1) {
                            if (yzyVar == yzy.FP) {
                                this.a.b();
                            }
                            kyf.d(yzyVar);
                            return;
                        }
                        if (i42 == 2) {
                            if (yzyVar == yzy.FP) {
                                this.a.b();
                            }
                        } else if (i42 == 3) {
                            if (yzyVar == yzy.FP) {
                                this.a.b();
                            }
                        } else if (i42 != 4) {
                            if (yzyVar == yzy.FP) {
                                this.a.b();
                            }
                            kyf.c(yzyVar);
                        } else {
                            if (yzyVar == yzy.FP) {
                                this.a.b();
                            }
                            kyf.c(yzyVar);
                        }
                    }
                });
            }
            final int i5 = 5;
            return new nvm(context4, R.string.assistant_quick_feedback_prompt, 0, "Assistant Quick Feedback Notification", GhIcon.p(context4, R.drawable.ic_assistant_logo), yzz.CSAT_ASSISTANT, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), new nvo(this) { // from class: kye
                public final /* synthetic */ kyf a;

                {
                    this.a = this;
                }

                @Override // defpackage.nvo
                public final void a(yzy yzyVar) {
                    int i42 = i5;
                    if (i42 == 0) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i42 == 1) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i42 == 2) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i42 == 3) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i42 != 4) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    } else {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    }
                }
            });
        }
        int i6 = true != zB ? R.drawable.assistant_robin_conversation_mode_icon : R.drawable.assistant_robin_conversation_mode_icon_inset;
        boolean zAS5 = acxa.aS();
        Context context5 = this.c;
        if (zAS5) {
            final int i7 = 2;
            return new nvm(R.string.gemini_live_quick_feedback_hun_prompt, R.string.gemini_live_quick_feedback_dashboard_prompt, lnm.F(context5, i6, true), yzz.CSAT_GEMINI_LIVE, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), new nvo(this) { // from class: kye
                public final /* synthetic */ kyf a;

                {
                    this.a = this;
                }

                @Override // defpackage.nvo
                public final void a(yzy yzyVar) {
                    int i42 = i7;
                    if (i42 == 0) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i42 == 1) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.d(yzyVar);
                        return;
                    }
                    if (i42 == 2) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i42 == 3) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                    } else if (i42 != 4) {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    } else {
                        if (yzyVar == yzy.FP) {
                            this.a.b();
                        }
                        kyf.c(yzyVar);
                    }
                }
            });
        }
        final int i8 = 3;
        return new nvm(context5, R.string.gemini_live_quick_feedback_hun_prompt, R.string.gemini_live_quick_feedback_dashboard_prompt, "Assistant Quick Feedback Notification", GhIcon.p(context5, i6), yzz.CSAT_GEMINI_LIVE, new ComponentName(RemoteApiConstants.NOW_PACKAGE, "CarAssistantQuickFeedbackProvider"), new nvo(this) { // from class: kye
            public final /* synthetic */ kyf a;

            {
                this.a = this;
            }

            @Override // defpackage.nvo
            public final void a(yzy yzyVar) {
                int i42 = i8;
                if (i42 == 0) {
                    if (yzyVar == yzy.FP) {
                        this.a.b();
                    }
                    kyf.d(yzyVar);
                    return;
                }
                if (i42 == 1) {
                    if (yzyVar == yzy.FP) {
                        this.a.b();
                    }
                    kyf.d(yzyVar);
                    return;
                }
                if (i42 == 2) {
                    if (yzyVar == yzy.FP) {
                        this.a.b();
                    }
                } else if (i42 == 3) {
                    if (yzyVar == yzy.FP) {
                        this.a.b();
                    }
                } else if (i42 != 4) {
                    if (yzyVar == yzy.FP) {
                        this.a.b();
                    }
                    kyf.c(yzyVar);
                } else {
                    if (yzyVar == yzy.FP) {
                        this.a.b();
                    }
                    kyf.c(yzyVar);
                }
            }
        });
    }

    public final void b() {
        lbt.l.e(this.c);
    }
}
