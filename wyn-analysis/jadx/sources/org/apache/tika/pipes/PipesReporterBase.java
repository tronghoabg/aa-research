package org.apache.tika.pipes;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.config.Param;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.PipesResult;

/* loaded from: classes5.dex */
public abstract class PipesReporterBase extends PipesReporter implements Initializable {
    private StatusFilter statusFilter;
    private final Set<PipesResult.STATUS> includes = new HashSet();
    private final Set<PipesResult.STATUS> excludes = new HashSet();

    public static class AcceptAllFilter extends StatusFilter {
        public /* synthetic */ AcceptAllFilter(int i5) {
            this();
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return true;
        }

        private AcceptAllFilter() {
            super(0);
        }
    }

    public static class ExcludesFilter extends StatusFilter {
        private final Set<PipesResult.STATUS> excludes;

        public ExcludesFilter(Set<PipesResult.STATUS> set) {
            super(0);
            this.excludes = set;
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return !this.excludes.contains(status);
        }
    }

    public static class IncludesFilter extends StatusFilter {
        private final Set<PipesResult.STATUS> includes;

        public /* synthetic */ IncludesFilter(int i5, Set set) {
            this(set);
        }

        @Override // org.apache.tika.pipes.PipesReporterBase.StatusFilter
        public boolean accept(PipesResult.STATUS status) {
            return this.includes.contains(status);
        }

        private IncludesFilter(Set<PipesResult.STATUS> set) {
            super(0);
            this.includes = set;
        }
    }

    public static abstract class StatusFilter {
        public /* synthetic */ StatusFilter(int i5) {
            this();
        }

        public abstract boolean accept(PipesResult.STATUS status);

        private StatusFilter() {
        }
    }

    private StatusFilter buildStatusFilter(Set<PipesResult.STATUS> set, Set<PipesResult.STATUS> set2) throws TikaConfigException {
        if (set.size() > 0 && set2.size() > 0) {
            throw new TikaConfigException("Only one of includes and excludes may have any contents");
        }
        int i5 = 0;
        return set.size() > 0 ? new IncludesFilter(i5, set) : set2.size() > 0 ? new ExcludesFilter(set2) : new AcceptAllFilter(i5);
    }

    private String getOptionString() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        for (PipesResult.STATUS status : PipesResult.STATUS.values()) {
            i5++;
            if (i5 > 1) {
                sb2.append(", ");
            }
            sb2.append(status.name());
        }
        return sb2.toString();
    }

    public boolean accept(PipesResult.STATUS status) {
        return this.statusFilter.accept(status);
    }

    @Override // org.apache.tika.config.Initializable
    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
    }

    @Override // org.apache.tika.config.Initializable
    public void initialize(Map<String, Param> map) throws TikaConfigException {
        this.statusFilter = buildStatusFilter(this.includes, this.excludes);
    }

    @Field
    public void setExcludes(List<String> list) throws TikaConfigException {
        for (String str : list) {
            try {
                this.excludes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e7) {
                throw new TikaConfigException(N0.a.h("I regret I don't recognize ", str, ". I only understand: ", getOptionString()), e7);
            }
        }
    }

    @Field
    public void setIncludes(List<String> list) throws TikaConfigException {
        for (String str : list) {
            try {
                this.includes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e7) {
                throw new TikaConfigException(N0.a.h("I regret I don't recognize ", str, ". I only understand: ", getOptionString()), e7);
            }
        }
    }
}
