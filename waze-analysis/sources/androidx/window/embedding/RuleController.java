package androidx.window.embedding;

import android.content.Context;
import android.content.res.Resources;
import androidx.window.embedding.EmbeddingBackend;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RuleController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend embeddingBackend;

    public RuleController(EmbeddingBackend embeddingBackend) {
        x.f(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    public static final RuleController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final Set<EmbeddingRule> parseRules(Context context, int i2) {
        return Companion.parseRules(context, i2);
    }

    public final void addRule(EmbeddingRule embeddingRule) {
        x.f(embeddingRule, "rule");
        this.embeddingBackend.addRule(embeddingRule);
    }

    public final void clearRules() {
        this.embeddingBackend.setRules(a.p());
    }

    public final Set<EmbeddingRule> getRules() {
        return this.embeddingBackend.getRules();
    }

    public final void removeRule(EmbeddingRule embeddingRule) {
        x.f(embeddingRule, "rule");
        this.embeddingBackend.removeRule(embeddingRule);
    }

    public final void setRules(Set<? extends EmbeddingRule> set) {
        x.f(set, "rules");
        this.embeddingBackend.setRules(set);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final RuleController getInstance(Context context) {
            x.f(context, "context");
            Context applicationContext = context.getApplicationContext();
            EmbeddingBackend.Companion companion = EmbeddingBackend.Companion;
            x.c(applicationContext);
            return new RuleController(companion.getInstance(applicationContext));
        }

        public final Set<EmbeddingRule> parseRules(Context context, int i2) throws Resources.NotFoundException {
            x.f(context, "context");
            RuleParser ruleParser = RuleParser.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            x.e(applicationContext, "getApplicationContext(...)");
            Set<EmbeddingRule> rules$window = ruleParser.parseRules$window(applicationContext, i2);
            return rules$window == null ? a.p() : rules$window;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
