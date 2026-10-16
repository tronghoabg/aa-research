.class public final LN8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;

.field public volatile c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LL8/r;)V
    .locals 3

    .line 1
    new-instance v0, LQ8/b;

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v1, LXd/c;

    const/16 v2, 0x19

    .line 4
    invoke-direct {v1, v2}, LXd/c;-><init>(I)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object v0, p0, LN8/b;->c:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LN8/b;->a:Ljava/lang/Object;

    .line 8
    iput-object v1, p0, LN8/b;->b:Ljava/lang/Object;

    .line 9
    new-instance v0, LN8/a;

    invoke-direct {v0, p0}, LN8/a;-><init>(LN8/b;)V

    invoke-virtual {p1, v0}, LL8/r;->a(LO9/a;)V

    return-void
.end method

.method public constructor <init>(Ly1/g;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, LN8/b;->a:Ljava/lang/Object;

    return-void
.end method
