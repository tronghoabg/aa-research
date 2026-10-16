package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.ao;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, e<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> eVar) {
        super(2, eVar);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final ao aoVar = new ao();
            final ao aoVar2 = new ao();
            final ao aoVar3 = new ao();
            k<Interaction> interactions = this.this$0.interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            this.label = 1;
            if (interactions.collect(new l() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                public final Object emit(Interaction interaction, e<? super ab> eVar) {
                    boolean z = true;
                    if (interaction instanceof PressInteraction.Press) {
                        aoVar.f48103a++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        ao aoVar4 = aoVar;
                        aoVar4.f48103a--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        ao aoVar5 = aoVar;
                        aoVar5.f48103a--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        aoVar2.f48103a++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        ao aoVar6 = aoVar2;
                        aoVar6.f48103a--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        aoVar3.f48103a++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        ao aoVar7 = aoVar3;
                        aoVar7.f48103a--;
                    }
                    boolean z2 = false;
                    boolean z3 = aoVar.f48103a > 0;
                    boolean z4 = aoVar2.f48103a > 0;
                    boolean z5 = aoVar3.f48103a > 0;
                    if (defaultDebugIndicationInstance.isPressed != z3) {
                        defaultDebugIndicationInstance.isPressed = z3;
                        z2 = true;
                    }
                    if (defaultDebugIndicationInstance.isHovered != z4) {
                        defaultDebugIndicationInstance.isHovered = z4;
                    } else {
                        z = z2;
                    }
                    if (defaultDebugIndicationInstance.isFocused == z5) {
                        if (z) {
                        }
                        return ab.f48028a;
                    }
                    defaultDebugIndicationInstance.isFocused = z5;
                    DrawModifierNodeKt.invalidateDraw(defaultDebugIndicationInstance);
                    return ab.f48028a;
                }

                @Override // kotlinx.coroutines.b.l
                public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                    return emit((Interaction) obj2, (e<? super ab>) eVar);
                }
            }, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
