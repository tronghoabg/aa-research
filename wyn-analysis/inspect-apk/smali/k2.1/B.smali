.class public final Lk2/B;
.super Lk2/x;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/Object;


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk2/B;->e:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lk2/x;-><init>(LN1/N;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lk2/B;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Lk2/B;->d:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    .line 1
    sget-object v0, Lk2/B;->e:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk2/B;->d:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_0
    iget-object v0, p0, Lk2/x;->b:LN1/N;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, LN1/N;->b(Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final f(ILN1/L;Z)LN1/L;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/x;->b:LN1/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, LN1/N;->f(ILN1/L;Z)LN1/L;

    .line 4
    .line 5
    .line 6
    iget-object p1, p2, LN1/L;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v0, p0, Lk2/B;->d:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    sget-object p1, Lk2/B;->e:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p1, p2, LN1/L;->b:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    return-object p2
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/x;->b:LN1/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN1/N;->l(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, LQ1/x;->a:I

    .line 8
    .line 9
    iget-object v0, p0, Lk2/B;->d:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lk2/B;->e:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-object p1
.end method

.method public final m(ILN1/M;J)LN1/M;
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/x;->b:LN1/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 4
    .line 5
    .line 6
    iget-object p1, p2, LN1/M;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p3, p0, Lk2/B;->c:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {p1, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p1, LN1/M;->q:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p1, p2, LN1/M;->a:Ljava/lang/Object;

    .line 19
    .line 20
    :cond_0
    return-object p2
.end method
