.class public Lorg/apache/tika/sax/StandardReference;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/sax/StandardReference$StandardReferenceBuilder;
    }
.end annotation


# instance fields
.field private identifier:Ljava/lang/String;

.field private mainOrganization:Ljava/lang/String;

.field private score:D

.field private secondOrganization:Ljava/lang/String;

.field private separator:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lorg/apache/tika/sax/StandardReference;->score:D

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lorg/apache/tika/sax/StandardReference;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    return-void
.end method


# virtual methods
.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMainOrganizationAcronym()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/sax/StandardReference;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getSecondOrganizationAcronym()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSeparator()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public setIdentifier(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setMainOrganizationAcronym(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setScore(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/sax/StandardReference;->score:D

    .line 2
    .line 3
    return-void
.end method

.method public setSecondOrganizationAcronym(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSeparator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/tika/sax/StandardReference;->mainOrganization:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lorg/apache/tika/sax/StandardReference;->separator:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p0, Lorg/apache/tika/sax/StandardReference;->secondOrganization:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    iget-object v1, p0, Lorg/apache/tika/sax/StandardReference;->identifier:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, " "

    .line 24
    .line 25
    invoke-static {v0, v2, v1}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
