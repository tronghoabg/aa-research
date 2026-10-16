.class public final LP1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:Ll8/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP1/c;

    .line 2
    .line 3
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 4
    .line 5
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 6
    .line 7
    invoke-direct {v0, v1}, LP1/c;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {v0}, LQ1/x;->E(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LP1/c;->a:Ll8/K;

    .line 9
    .line 10
    return-void
.end method
