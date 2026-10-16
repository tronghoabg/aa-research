.class public final Ljb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La2/c;

.field public final b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(La2/c;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljb/f;->a:La2/c;

    .line 5
    .line 6
    iput-object p2, p0, Ljb/f;->b:Ljava/lang/Runnable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Ljb/f;->a:La2/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La2/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljb/e;

    .line 8
    .line 9
    iget v0, v0, Ljb/e;->c:I

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method
