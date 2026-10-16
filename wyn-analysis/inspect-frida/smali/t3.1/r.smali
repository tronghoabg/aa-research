.class public final Lt3/r;
.super Lt3/q;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lx/e;

.field public final synthetic b:Lt3/s;


# direct methods
.method public constructor <init>(Lt3/s;Lx/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt3/r;->b:Lt3/s;

    .line 5
    .line 6
    iput-object p2, p0, Lt3/r;->a:Lx/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Lt3/p;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/r;->b:Lt3/s;

    .line 2
    .line 3
    iget-object v0, v0, Lt3/s;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v1, p0, Lt3/r;->a:Lx/e;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lt3/p;->w(Lt3/o;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
