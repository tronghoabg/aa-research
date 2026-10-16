package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.ArrayList;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FloatingActionButtonElevation$animateElevation$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevation$animateElevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, e<? super FloatingActionButtonElevation$animateElevation$2$1> eVar) {
        super(2, eVar);
        this.$interactionSource = interactionSource;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.$interactionSource, this.$animatable, eVar);
        floatingActionButtonElevation$animateElevation$2$1.L$0 = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final af afVar = (af) this.L$0;
            final ArrayList arrayList = new ArrayList();
            InteractionSource interactionSource = this.$interactionSource;
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            this.label = 1;
            if (interactionSource.getInteractions().collect(new l() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                /* compiled from: WazeSource */
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00681 extends g implements p<af, e<? super ab>, Object> {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ Interaction $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00681(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, e<? super C00681> eVar) {
                        super(2, eVar);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = interaction;
                    }

                    @Override // h.c.b.a.a
                    public final e<ab> create(Object obj, e<?> eVar) {
                        return new C00681(this.$animatable, this.$targetInteraction, eVar);
                    }

                    @Override // h.g.a.p
                    public final Object invoke(af afVar, e<? super ab> eVar) {
                        return ((C00681) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        a aVar = a.f48038a;
                        int i2 = this.label;
                        if (i2 == 0) {
                            c.b(obj);
                            this.label = 1;
                            if (this.$animatable.animateElevation(this.$targetInteraction, this) == aVar) {
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

                public final Object emit(Interaction interaction, e<? super ab> eVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    aj.z(afVar, null, null, new C00681(floatingActionButtonElevationAnimatable, (Interaction) i.U(arrayList), null), 3);
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
