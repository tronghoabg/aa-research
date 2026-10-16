package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AlignmentLineProvider {
    public static final int $stable = 0;

    /* compiled from: WazeSource */
    public final class Block extends AlignmentLineProvider {
        public static final int $stable = 8;
        private final AlignmentLineProviderBlock lineProviderBlock;

        public Block(AlignmentLineProviderBlock alignmentLineProviderBlock) {
            super(null);
            this.lineProviderBlock = alignmentLineProviderBlock;
        }

        public static /* synthetic */ Block copy$default(Block block, AlignmentLineProviderBlock alignmentLineProviderBlock, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                alignmentLineProviderBlock = block.lineProviderBlock;
            }
            return block.copy(alignmentLineProviderBlock);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return this.lineProviderBlock.calculateAlignmentLinePosition(placeable);
        }

        public final AlignmentLineProviderBlock component1() {
            return this.lineProviderBlock;
        }

        public final Block copy(AlignmentLineProviderBlock alignmentLineProviderBlock) {
            return new Block(alignmentLineProviderBlock);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && x.n(this.lineProviderBlock, ((Block) obj).lineProviderBlock);
        }

        public final AlignmentLineProviderBlock getLineProviderBlock() {
            return this.lineProviderBlock;
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    /* compiled from: WazeSource */
    public final class Value extends AlignmentLineProvider {
        public static final int $stable = 0;
        private final AlignmentLine alignmentLine;

        public Value(AlignmentLine alignmentLine) {
            super(null);
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value copy$default(Value value, AlignmentLine alignmentLine, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                alignmentLine = value.alignmentLine;
            }
            return value.copy(alignmentLine);
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(Placeable placeable) {
            return placeable.get(this.alignmentLine);
        }

        public final AlignmentLine component1() {
            return this.alignmentLine;
        }

        public final Value copy(AlignmentLine alignmentLine) {
            return new Value(alignmentLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && x.n(this.alignmentLine, ((Value) obj).alignmentLine);
        }

        public final AlignmentLine getAlignmentLine() {
            return this.alignmentLine;
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    private AlignmentLineProvider() {
    }

    public abstract int calculateAlignmentLinePosition(Placeable placeable);

    public /* synthetic */ AlignmentLineProvider(o oVar) {
        this();
    }
}
