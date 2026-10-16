.class public final Lc2/a;
.super LT1/e;
.source "SourceFile"


# instance fields
.field public e:Landroid/graphics/Bitmap;

.field public final synthetic f:Lc2/b;


# direct methods
.method public constructor <init>(Lc2/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, LH5/a;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lc2/a;->f:Lc2/b;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final o()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc2/a;->e:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LH5/a;->b:I

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, LT1/e;->c:J

    .line 10
    .line 11
    iput-boolean v0, p0, LT1/e;->d:Z

    .line 12
    .line 13
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc2/a;->f:Lc2/b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lc2/b;->l(LT1/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
