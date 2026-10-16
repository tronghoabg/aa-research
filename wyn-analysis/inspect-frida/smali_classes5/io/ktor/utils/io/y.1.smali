.class public final Lio/ktor/utils/io/y;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lio/ktor/utils/io/t;

.field public b:LPf/a;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/ktor/utils/io/y;->c:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/y;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/y;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lio/ktor/utils/io/N;->j(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
