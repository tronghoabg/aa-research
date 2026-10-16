.class public final LIf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljf/h;


# instance fields
.field public final synthetic a:Ljf/h;

.field public final b:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljf/h;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LIf/u;->a:Ljf/h;

    .line 5
    .line 6
    iput-object p2, p0, LIf/u;->b:Ljava/lang/Throwable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/u;->a:Ljf/h;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ljf/h;->fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final get(Ljf/g;)Ljf/f;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/u;->a:Ljf/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final minusKey(Ljf/g;)Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/u;->a:Ljf/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljf/h;->minusKey(Ljf/g;)Ljf/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final plus(Ljf/h;)Ljf/h;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/u;->a:Ljf/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
