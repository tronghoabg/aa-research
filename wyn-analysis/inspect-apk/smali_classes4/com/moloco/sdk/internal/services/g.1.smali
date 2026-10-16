.class public final Lcom/moloco/sdk/internal/services/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/g;->a:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LLf/d;->b:LLf/d;

    .line 4
    .line 5
    new-instance v1, Lcom/moloco/sdk/internal/services/f;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p2, p0, p1, v2}, Lcom/moloco/sdk/internal/services/f;-><init>(Ljava/lang/String;Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    return-object p1
.end method

.method public final b(Ljava/lang/String;Llf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, LEf/S;->a:LLf/e;

    .line 2
    .line 3
    sget-object v0, LLf/d;->b:LLf/d;

    .line 4
    .line 5
    new-instance v1, Lcom/moloco/sdk/internal/services/e;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/moloco/sdk/internal/services/e;-><init>(Lcom/moloco/sdk/internal/services/g;Ljava/lang/String;Ljf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    return-object p1
.end method
