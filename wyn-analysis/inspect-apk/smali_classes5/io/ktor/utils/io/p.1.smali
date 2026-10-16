.class public final Lio/ktor/utils/io/p;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Z

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lio/ktor/utils/io/q;

.field public d:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/q;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/p;->c:Lio/ktor/utils/io/q;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/ktor/utils/io/p;->b:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/p;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/p;->d:I

    iget-object p1, p0, Lio/ktor/utils/io/p;->c:Lio/ktor/utils/io/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lio/ktor/utils/io/q;->d(ZLlf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
