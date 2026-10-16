.class public final Lio/ktor/utils/io/C;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lio/ktor/utils/io/t;

.field public b:Ljava/lang/Appendable;

.field public c:Ljava/lang/AutoCloseable;

.field public d:LPf/a;

.field public e:I

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public h:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/ktor/utils/io/C;->g:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/C;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/C;->h:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p1, v0, v0, p0}, Lio/ktor/utils/io/N;->n(Lio/ktor/utils/io/t;LLd/c;IILlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
