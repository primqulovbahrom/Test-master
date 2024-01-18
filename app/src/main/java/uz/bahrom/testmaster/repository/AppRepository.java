package uz.bahrom.testmaster.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.bahrom.testmaster.data.QuestionData;


public class AppRepository {
    private ArrayList<QuestionData> elementary;
    private ArrayList<QuestionData> preIntermediate;
    private ArrayList<QuestionData> intermediate;
    private ArrayList<QuestionData> upperIntermediate;

    private static AppRepository instance;

    private AppRepository() {
        loadTest();
    }

    public static AppRepository getInstance() {
        if (instance == null) instance = new AppRepository();
        return instance;
    }

    private void loadTest() {
        elementary = new ArrayList<>();

        elementary.add(new QuestionData(
                "A- Hello, what ______ your name?",
                "is",
                "are",
                "am",
                "be",
                "is"
        ));

        elementary.add(new QuestionData(
                "______ name is John. And my ______ is Johnson.",
                "Your / surname",
                "My / surname",
                "I / surname",
                "I / name",
                "My / surname"
        ));

        elementary.add(new QuestionData(
                "My name is Lisa. ______ Lisa Peterson.",
                "My am",
                "I is",
                "I am",
                "I",
                "I am"
        ));

        elementary.add(new QuestionData(
                "______ name is Apple. ______ Ann Apple.",
                "His / She",
                "His / He’s",
                "Her / She’s",
                "His / His",
                "Her / She’s"
        ));

        elementary.add(new QuestionData(
                "“Where ______ John from?” “______ from the US.”",
                "is / He’s",
                "is / His",
                "am / He’s",
                "is / She’s",
                "is / He’s"
        ));

        elementary.add(new QuestionData(
                "______ are you from? Japan",
                "What",
                "Who",
                "Where",
                "When",
                "Where"
        ));

        elementary.add(new QuestionData(
                "Where ______ you ______ ?",
                "is / from",
                "are / in",
                "are / is",
                "are / from",
                "are / from"
        ));

        elementary.add(new QuestionData(
                "______ from Spain. I’m Rodriguez .",
                "I’m",
                "He’s",
                "You’re",
                "She’s",
                "I’m"
        ));

        elementary.add(new QuestionData(
                "Pierre is a French boy. ______ from ______ .",
                "He’s / France",
                "His’s / French",
                "His / France",
                "He / France",
                "He’s / France"
        ));

        elementary.add(new QuestionData(
                "Lisa and Max are Americans. ______ from U.S.A.",
                "There",
                "Their",
                "They’re",
                "Their’re",
                "They’re"
        ));

        //11
        elementary.add(new QuestionData(
                "What _____ Dick and Tom like _____?",
                "do / doing",
                "doing / *",
                "do / do",
                " does / doing",
                "do / doing"
        ));

        //12
        elementary.add(new QuestionData(
                "They _____ wash _____ car every day.",
                "don’t / my",
                "don’t / his",
                "don’t / their",
                "don’t / our",
                "don’t / their"
        ));

        //13
        elementary.add(new QuestionData(
                "You _____ a lot of things in _____ free time.",
                "do / our",
                "does / your",
                "do / my",
                "do / your",
                "do / your"
                //4,11
        ));

        //14
        elementary.add(new QuestionData(
                "She likes _____ TV, but her husband doesn’t.",
                "watching",
                "to watch",
                "watches",
                "watched",
                "watching"
                //4,14
        ));

        //15
        elementary.add(new QuestionData(
                "Tom _____ her but she doesn’t like _____ .",
                "like / her",
                "likes / him",
                "likes / he",
                "like / him",
                "likes / him"
                //4,18
        ));

        //16
        elementary.add(new QuestionData(
                "Mike eats cheeseburgers because _____ likes _____ .",
                "he / their",
                " him / they",
                "he / them",
                "him / them",
                "he / them"
                //4,20
        ));

        //17
        elementary.add(new QuestionData(
                "It is five to nine",
                "9:55",
                "9:35",
                "8:55",
                "9:05",
                "8:55"
                //4,24
        ));

        //18
        elementary.add(new QuestionData(
                "I _____ my teeth every morning",
                "brushing",
                "brush",
                "brushes",
                "to brush",
                "brush"
                //4,27
        ));

        //19
        elementary.add(new QuestionData(
                "My father _____ driving.",
                "doesn’t likes",
                "don’t likes",
                "doesn’t like",
                "don’t like",
                "doesn’t like"
                //4,30
        ));

        //20
        elementary.add(new QuestionData(
                "Every year millions of people _____ The London Museum.",
                "visit",
                "go",
                "come",
                "want",
                "visit"
                //4,33
        ));

        //21
        elementary.add(new QuestionData(
                "Many foreigners in our country _____ to the Golden Bazaar.",
                "buy",
                "go shopping",
                "want",
                "come",
                "go shopping"
                //4,37
        ));

        //22
        elementary.add(new QuestionData(
                "How many _____ are there in the cupboard.",
                "glass",
                "of glasses",
                "a glass",
                "glasses",
                "glasses"
                //5,16
        ));

        //23
        elementary.add(new QuestionData(
                "There _____ any flowers.",
                "are",
                "is",
                "aren’t",
                "isn’t",
                "aren’t"
                //5,30
        ));

        //24
        elementary.add(new QuestionData(
                "The cinema is _____ the left",
                "in",
                "at",
                "off",
                "on",
                "on"
                //5,35
        ));

        //25
        elementary.add(new QuestionData(
                "There _____ a post box in front of the chemist’s.",
                "are",
                "is",
                "some",
                "any",
                "is"
                //5,40
        ));

        //26
        elementary.add(new QuestionData(
                "I like Judy, _____ I often visit her.",
                "so",
                "because",
                "but",
                "but",
                "so"
                //5,53
        ));

        //27
        elementary.add(new QuestionData(
                "In my bedroom there’s a bed _____ a wardrobe.",
                "but",
                "so",
                "vand",
                "also",
                "vand"
                //5,57
        ));

        //28
        elementary.add(new QuestionData(
                "I _____ play chess _____ I was five.",
                "can / when",
                "could / when",
                "could / what",
                "can / where",
                "could / when"
                //6,14
        ));

        //29
        elementary.add(new QuestionData(
                "_____ Ben and Jane married ten years ago?",
                "Was",
                "Were",
                "Are",
                "Is",
                "Were"
                //6,20
        ));

        //30
        elementary.add(new QuestionData(
                "I love Netherlands, _____ I came to Amsterdam.",
                "and",
                "however",
                "for",
                "so",
                "so"
                //6,26
        ));

        //31
        elementary.add(new QuestionData(
                "Flora _____ drive a car but she _____ ride a motorbike.",
                "can / can’t",
                "is / can’t",
                "can’t / can’t",
                "is / can",
                "can / can’t"
                //6,40
        ));

        //32
        elementary.add(new QuestionData(
                "Yesterday there was a party _____ my house.",
                "at",
                "in",
                "for",
                "on",
                "in"
                //6,46
        ));

        preIntermediate = new ArrayList<>();

        //1
        preIntermediate.add(new QuestionData(
                "_____ three languages: French, Spanish, and English.",
                "I’m speak",
                "I’m speaking",
                "I speaking",
                "I speak",
                "I speak"
                //1, 1
        ));

        //2
        preIntermediate.add(new QuestionData(
                "How many sisters _____ ?",
                "do you have",
                "you have",
                "are you have",
                "do you has",
                "do you have"
                //1,19
        ));

        //3
        preIntermediate.add(new QuestionData(
                "What time _____ home last night?",
                "did you get",
                "you get",
                "do you get",
                "did you got",
                "did you get"
                //1,21
        ));

        //4
        preIntermediate.add(new QuestionData(
                "Most of the students _____ these days.",
                "didn’t smoke",
                "aren’t smoking",
                "isn’t smoking",
                "don’t smoke",
                "aren’t smoking"
                //1, 29
        ));

        //5
        preIntermediate.add(new QuestionData(
                "Mobile phones, televisions, and radios are a means of _____.",
                "communication",
                "transport",
                "media",
                "civilization",
                "communication"
                //1, 61
        ));

        //6
        preIntermediate.add(new QuestionData(
                "Romans, Greek and Egyptians are all _____ nations.",
                "ancient",
                "old",
                "dated",
                "modern",
                "ancient"
                //1, 65
        ));

        //7
        preIntermediate.add(new QuestionData(
                "Nurses _____ after people in hospital",
                "looks",
                "is looking",
                "will look",
                "look",
                "look"
                //2,5
        ));

        //8
        preIntermediate.add(new QuestionData(
                "Every morning Tessa _____ at 7.30",
                "is getting up",
                "got up",
                "get up",
                "gets up",
                "gets up"
                //2,11
        ));

        //9
        preIntermediate.add(new QuestionData(
                "Turn the T.V off. No one _____ it!",
                "watches",
                "watch",
                "is watching",
                "watched",
                "is watching"
                //2,16
        ));

        //10
        preIntermediate.add(new QuestionData(
                "Jack’s a policeman but he _____ a uniform.",
                "doesn’t wear",
                "isn’t wearing",
                "no wear",
                "wears",
                "doesn’t wear"
                //2, 22
        ));

        //11
        preIntermediate.add(new QuestionData(
                "I _____ a bicycle when I was young.",
                "have",
                "am having",
                "had",
                "have got",
                "had"
                //2, 37
        ));

        //12
        preIntermediate.add(new QuestionData(
                "The Pope _____ in Vatican",
                "live",
                "lived",
                "lives",
                "will live",
                "lives"
                //2, 41
        ));

        //13
        preIntermediate.add(new QuestionData(
                "I was born in Africa _____ 1970.",
                "on",
                "at",
                "in",
                "last",
                "in"
                //3, 1
        ));

        //14
        preIntermediate.add(new QuestionData(
                "We got up late _____ Sunday morning",
                "*",
                "at",
                "on",
                "in",
                "on"
                //3, 11
        ));

        //15
        preIntermediate.add(new QuestionData(
                "She _____ a bright red coat yesterday.",
                "wore",
                "was wearing",
                "wear",
                "was wear",
                "was wearing"
                //3, 21
        ));

        //16
        preIntermediate.add(new QuestionData(
                "I _____ a very good program on TV last night",
                "was seeing",
                "see",
                "am seeing",
                "saw",
                "saw"
                //3, 36
        ));

        //17
        preIntermediate.add(new QuestionData(
                "How _____ your finger?",
                "are you cutting",
                "were you cutting",
                "did you cut",
                "you cut",
                "did you cut"
                //3, 39
        ));

        //18
        preIntermediate.add(new QuestionData(
                "_____ a good time last night?",
                "Did you have",
                "Were you having",
                "Will you have",
                "Are you having",
                "Did you have"
                //3, 42
        ));

        //19
        preIntermediate.add(new QuestionData(
                "But when I _____ up the phone, there was no one there",
                "pick",
                "am picking",
                "picked",
                "was picking",
                "picked"
                //3, 46
        ));

        //20
        preIntermediate.add(new QuestionData(
                "I worked on a farm _____ the holidays.",
                "for",
                "since",
                "while",
                "on",
                "on"
                //3, 50
        ));

        //21
        preIntermediate.add(new QuestionData(
                "We don’t need _____ eggs. Just half a dozen.",
                "a little",
                "many",
                "much",
                "a few",
                "many"
                //4, 10
        ));

        //22
        preIntermediate.add(new QuestionData(
                "Is there _____ traffic in your town?",
                "a few",
                "many",
                "some",
                "much",
                "much"
                //4, 11
        ));

        //23
        preIntermediate.add(new QuestionData(
                "If _____ asks, tell them I’ve got a cold.",
                "anyone",
                "anything",
                "somewhere",
                "somebody",
                ""
                //4, 50
        ));

        //24
        preIntermediate.add(new QuestionData(
                "“_____ your teacher?”\n" +
                        "“Yes, she’s very nice.”",
                "Did you like",
                "Would you like",
                "Will you like",
                "Do you like",
                "Did you like"
                //5, 3
        ));

        //25
        preIntermediate.add(new QuestionData(
                "We’ve decided _____ married in the spring",
                "get",
                "to get",
                "getting",
                "got",
                "to get"
                //5, 13
        ));

        //26
        preIntermediate.add(new QuestionData(
                "I _____ my job soon.",
                "think changing",
                "am thinking of changing",
                "am thinking to change",
                "think change",
                "am thinking of changing"
                //5, 18
        ));

        //27
        preIntermediate.add(new QuestionData(
                "Bill is looking _____ his keys but he can’t find them.",
                "for",
                "at",
                "to",
                "in",
                "for"
                //5, 27
        ));

        //28
        preIntermediate.add(new QuestionData(
                "Hi, Dave. Pete _____ a shower at the moment. I’ll just _____ and tell him",
                "is having / go",
                "had / went",
                "is having / come",
                "will have / will go",
                "is having / go"
                //5, 39
        ));

        //29
        preIntermediate.add(new QuestionData(
                "Trains in London are more crowded _____ in Paris",
                "that",
                "as",
                "than",
                "like",
                "than"
                //6, 4
        ));

        //30
        preIntermediate.add(new QuestionData(
                "My dad’s really ____. He always buys presents for everyone",
                "romantic",
                "fortunate",
                "generous",
                "depressed",
                "generous"
                //6,11
        ));

        //31
        preIntermediate.add(new QuestionData(
                "That’s the palace _____ the King lives.",
                "who",
                "which",
                "where",
                "when",
                "where"
                //6, 22
        ));

        //32
        preIntermediate.add(new QuestionData(
                "I run in races. I’m a(n) _____.",
                "pilot",
                "teenager",
                "athlete",
                "chef",
                "athlete"
                // 7, 8
        ));

        //intermediate
        intermediate = new ArrayList<>();

        //1
        intermediate.add(new QuestionData(
                " _____ you ever stayed at the Ritz?",
                "Did",
                "Have",
                "Was",
                "Were",
                "Have"
                //1, 1
        ));

        //2
        intermediate.add(new QuestionData(
                "You aren’t concentrating on your work. What are you thinking _____?",
                "to",
                "on",
                "with",
                "about",
                "about"
                //1, 37
        ));

        //3
        intermediate.add(new QuestionData(
                "English is _____ here.",
                "speak",
                "spoke",
                "is speaking",
                "spoken",
                "spoken"
                //2, 11
        ));

        //4
        intermediate.add(new QuestionData(
                "Volvos are _____ in Sweden",
                "produced",
                "produce",
                "produces",
                "producing",
                "produced"
                //2, 12
        ));

        //5
        intermediate.add(new QuestionData(
                "In Britain milk is _____ to your doorstep.",
                "shown",
                "sold",
                "bought",
                "delivered",
                "delivered"
                //2, 19
        ));

        //6
        intermediate.add(new QuestionData(
                "“Hello. Can I speak to Mr. James, please?” “I’m sorry. He isn’t _____ at the moment. Can I take a message?”",
                "in",
                "on",
                "at",
                "off",
                "in"
                //2, 33
        ));

        //7
        intermediate.add(new QuestionData(
                "Come on, kids! Aren’t you _____ yet? Breakfast’s on the table.",
                "in",
                "on",
                "up",
                "off",
                "up"
                //2, 38
        ));

        //8
        intermediate.add(new QuestionData(
                "I must be _____ soon. I want to get to the shops before they close.",
                "in",
                "on",
                "at",
                "off",
                "on"
                //2, 41
        ));

        //9
        intermediate.add(new QuestionData(
                "My uncle died _____ the war.",
                "via",
                "during",
                "for",
                "in",
                "in"
                //3, 1
        ));

        //10
        intermediate.add(new QuestionData(
                "What did you do _____ the weekend?",
                "at",
                "in",
                "with",
                "*",
                "at"
                //3, 20
        ));

        //11
        intermediate.add(new QuestionData(
                "My brother learned _____ the same time as me, but I passed first.",
                "at",
                "in",
                "on",
                "*",
                "at"
                //3, 30
        ));

        //12
        intermediate.add(new QuestionData(
                "I _____ work very hard because I have an exam next week",
                "am having",
                "has to",
                "had to",
                "have to",
                "have to"
                //4, 1
        ));

        //13
        intermediate.add(new QuestionData(
                "You _____ work hard after your exam. You can have a holiday.",
                "had to",
                "won’t have to",
                "have too",
                "won’t have",
                "won’t have to"
                //4, 2
        ));

        //14
        intermediate.add(new QuestionData(
                "I can’t see the small print very well. I think I ____ wear glasses soon.",
                "will have to",
                "won’t have to",
                "have to",
                "don’t have to",
                "will have to"
                //4, 7
        ));

        //15
        intermediate.add(new QuestionData(
                "You _____ be a millionaire to shop in Harrods. Everything is expensive there",
                "will have to",
                "won’t have to",
                "have to",
                "don’t have to",
                "have to"
                //4, 11
        ));

        //16
        intermediate.add(new QuestionData(
                "If I fail my exam, ____ I ___ take it again?",
                "will / have to",
                "did / have to",
                "does / have to",
                "do / won’t have",
                "will / have to"
                //4, 12
        ));

        //17
        intermediate.add(new QuestionData(
                "In my country you _____ get married when you’re sixteen.",
                "can",
                "could",
                "managed to",
                "couldn’t",
                "can"
                //4, 23
        ));

        //18
        intermediate.add(new QuestionData(
                "_____ I borrow your dictionary?",
                "Can’t",
                "Could",
                "Manage to",
                "Couldn’t",
                "Could"
                //4, 25
        ));

        //19
        intermediate.add(new QuestionData(
                "I’m learning Spanish because I want _____ speak when I’m in Mexico.",
                "can",
                "could",
                "will be able to",
                "to be able to",
                "to be able to"
                //4, 29
        ));

        //20
        intermediate.add(new QuestionData(
                "You _____ drive on the right in Britain.",
                "mustn’t",
                "has to",
                "have to",
                "don’t have to",
                "have to"
                //4, 40
        ));

        //21
        intermediate.add(new QuestionData(
                "Ssh! You mustn’t _____ a noise. The baby’s asleep.",
                "do",
                "make",
                "get",
                "hear",
                "make"
                //5, 4
        ));

        //22
        intermediate.add(new QuestionData(
                "We asked to see the manager and we _____ a complaint about the terrible service in the restaurant.",
                "did",
                "made",
                "had",
                "heard",
                "made"
                //5, 6
        ));

        //23
        intermediate.add(new QuestionData(
                "Before you go on holiday, you should _____ sure that the doors and windows are shut and locked.",
                "do",
                "make",
                "get",
                "hear",
                "make"
                //5,12
        ));

        //24
        intermediate.add(new QuestionData(
                "Would you like _____ to eat?",
                "something",
                "anything",
                "nothing",
                "everything",
                "something"
                //5, 23
        ));

        //25
        intermediate.add(new QuestionData(
                "Come and see me _____ you want. I don’t mind.",
                "some time",
                "any time",
                "no time",
                "every time",
                "any time"
                //5, 27
        ));

        //26
        intermediate.add(new QuestionData(
                "What’s that smell? Can you smell _____ burning?",
                "something",
                "anything",
                "nothing",
                "everything",
                "something"
                //5, 32
        ));

        //27
        intermediate.add(new QuestionData(
                "“Who was at the party?” “_____: Pete, Ann, James, Kathy, all the Smiths, Sally Beams and Sally Rogers.”",
                "Someone",
                "Anyone",
                "No one",
                "Everyone",
                "Everyone"
                //5, 42
        ));

        //28
        intermediate.add(new QuestionData(
                "I don’t mind _____ to the restaurant.",
                "driving",
                "drive",
                "drove",
                "to drive",
                "driving"
                //6, 4
        ));

        //29
        intermediate.add(new QuestionData(
                "I’ll see you tomorrow at 11.00 _____ usual.",
                "like",
                "as - as",
                "like",
                "as",
                "as"
                //6, 14
        ));

        //30
        intermediate.add(new QuestionData(
                "My brother has a car _____ yours.",
                "likes",
                "such",
                "like",
                "as",
                "like"
                //6, 19
        ));

        //31
        intermediate.add(new QuestionData(
                "Toby, a boy _____ I went to school with, is ill in hospital.",
                "who",
                "which",
                "where",
                "whose",
                "who"
                //6, 43
        ));

        //32
        intermediate.add(new QuestionData(
                "“Oh, dear! The washing machine isn’t working. I haven’t got any clean clothes, and I’ve got to go to work. What am I going to do?’ ‘Don’t worry. I’ll ___ them all ___. Just go to work.’",
                "put / away",
                "find / out",
                "sort / out",
                "clear / up",
                "clear / up"
                //6, 54
        ));

        //upperIntermediate
        upperIntermediate = new ArrayList<>();

        //1
        upperIntermediate.add(new QuestionData(
                "The series of TV programs that has just finished ______ very useful",
                "are",
                "weren’t",
                "wasn’t",
                "were",
                "wasn’t"
                //2, 1
        ));

        //2
        upperIntermediate.add(new QuestionData(
                "I guess I didn’t buy her ______ gift.",
                "expensive enough",
                "an expensive enough",
                "expensive enough a",
                "an enough expensive",
                "an expensive enough"
                //2, 21
        ));

        //3
        upperIntermediate.add(new QuestionData(
                "Rome isn’t ______ as Milan is.",
                "as near to us",
                "as near us",
                "near us to",
                "to us near",
                "as near to us"
                //2, 24
        ));

        //4
        upperIntermediate.add(new QuestionData(
                "Do you walk ______, now that you live in a village?",
                "a lot of",
                "little",
                "very many",
                "more",
                "more"
                //2, 27
        ));

        //5
        upperIntermediate.add(new QuestionData(
                "Not all English people ______ fish and chips.",
                "likes",
                "doesn’t like",
                "don’t like",
                "like",
                "like"
                //2, 30
        ));

        //6
        upperIntermediate.add(new QuestionData(
                "It is very difficult to drive in ______.",
                "rush houred slow-moving traffic",
                "slow moving traffic of rush hour",
                "rush-hour slow moving traffic",
                "slow moving rush hour traffic",
                "slow moving rush hour traffic"
                //2, 31
        ));

        //7
        upperIntermediate.add(new QuestionData(
                "Either David or his parents ______ at home.",
                "is",
                "are",
                "was",
                "aren’t",
                "are"
                //2, 42
        ));

        //8
        upperIntermediate.add(new QuestionData(
                "It was a ______.",
                "thirty-minute show",
                "TV show thirty minute",
                "thirty minutes TV show",
                "TV show of thirty minute",
                "thirty-minute show"
                //2, 43
        ));

        //9
        upperIntermediate.add(new QuestionData(
                "We saw ______ last week.",
                "award winning of French film",
                "A French film award winning",
                "an award winning French film",
                "a film of French winning award",
                "an award winning French film"
                //2, 44
        ));

        //10
        upperIntermediate.add(new QuestionData(
                "The committee decided to award the prize to you and ______.",
                "I",
                "we",
                "his",
                "me",
                "me"
                //2, 49
        ));

        //11
        upperIntermediate.add(new QuestionData(
                "I agree. I get terribly ______ when people talk about politics.",
                "depression",
                "depressing",
                "depressed",
                "be depressed",
                "depressed"
                //2, 54
        ));

        //12
        upperIntermediate.add(new QuestionData(
                "Since the old lady’s husband died, she’s been living ______.",
                "herself",
                "on her own",
                "by itself",
                "by her",
                "on her own"
                //2, 60
        ));

        //13
        upperIntermediate.add(new QuestionData(
                "______ solved that problem must be very smart.",
                "Whomever",
                "Whatever",
                "Who",
                "Whoever",
                "Whoever"
                //2, 72
        ));

        //14
        upperIntermediate.add(new QuestionData(
                "I’ve got ______ a lot to do today. I’m really busy",
                "such",
                "so",
                "very",
                "too",
                "such"
                //2, 91
        ));

        //15
        upperIntermediate.add(new QuestionData(
                "The young man struck his boss and______ killed him.",
                "sudden",
                "accidentally",
                "bloody",
                "angry",
                "accidentally"
                //2, 102
        ));

        //16
        upperIntermediate.add(new QuestionData(
                "“There was a lot of traffic. The bus took half an hour to get from 5th Avenue to Broadway.” means: ______.",
                "The traffic was heavy but we could get to Broadway in half an hour.",
                "The traffic was heavy. That is why we got to Broadway late.",
                "If the traffic hadn’t been heavy, we could have got to Broadway earlier.",
                "There was so much traffic that it took us half an hour to get to Broadway.",
                "There was so much traffic that it took us half an hour to get to Broadway."
                //2, 112
        ));

        //17
        upperIntermediate.add(new QuestionData(
                "He has ______ Rolls Royce and ______ Audi 7 and ______ MG.",
                "a / a / a",
                "an / an / a",
                "a / an / an",
                "the / _ / an",
                "a / an / an"
                //2, 120
        ));

        //18
        upperIntermediate.add(new QuestionData(
                "Since the day he ______ ill he ______ a lot of reading",
                "was / had done",
                "is / has done",
                "was / has done",
                "is / has been done",
                "is / has been done"
                //4, 6
        ));

        //19
        upperIntermediate.add(new QuestionData(
                "He ______ my name, so I reminded him.",
                "forgets",
                "has forgotten",
                "had forgotten",
                "forgot",
                "had forgotten"
                //4, 21
        ));

        //20
        upperIntermediate.add(new QuestionData(
                "Go out and get some fresh air! You ______ here reading all morning.",
                "had been sitting",
                "were sitting",
                "are sitting",
                "have been sitting",
                "have been sitting"
                //4, 65
        ));

        //21
        upperIntermediate.add(new QuestionData(
                "The men were to ______ but the manager decided to give them a second change.",
                "have been dismissed",
                "dismissed",
                "being dismissed",
                "be dismissing",
                "have been dismissed"
                //4, 70
        ));

        //22
        upperIntermediate.add(new QuestionData(
                "By the end of this century most of the world’s oil supplies ______.",
                "have used up",
                "will have used up",
                "have been used up",
                "will have been used up",
                "will have been used up"
                //4, 77
        ));

        //23
        upperIntermediate.add(new QuestionData(
                "People say that Istanbul is one of the world’s most interesting cities. Istanbul ______ one of the world’s most interesting cities.",
                "said to be",
                "is said to be",
                "told to be",
                "was said to be",
                "is said to be"
                //4, 81
        ));

        //24
        upperIntermediate.add(new QuestionData(
                "Mars is the first planet ______.",
                "to discover",
                "was discovered",
                "to be discovered",
                "to have been discovered",
                "to be discovered"
                //4, 89
        ));

        //25
        upperIntermediate.add(new QuestionData(
                "They hadn’t done any damage to it. No damage ______ to it.",
                "was done",
                "had been done",
                "hadn’t been done",
                "has been done",
                "had been done"
                //4, 110
        ));

        //26
        upperIntermediate.add(new QuestionData(
                "People think he is guilty. He ______ guilty",
                "thought to be",
                "thinks he is",
                "is thought to be",
                "thought he was",
                "is thought to be"
                //4, 113
        ));

        //27
        upperIntermediate.add(new QuestionData(
                "The man who ______ by a snake was given a serum",
                "is bitten",
                "has been bitten",
                "had been bitten",
                "had bitten",
                "had been bitten"
                //4, 116
        ));

        //28
        upperIntermediate.add(new QuestionData(
                "The transistor ______ in 1948. As a result of this, both the size and the cost of electronic equipment______ greatly reduced.",
                "was invented / have been",
                "had been invented / has been",
                "was invented / have had",
                "had invented / will be",
                "was invented / have been"
                //4, 121
        ));

        //29
        upperIntermediate.add(new QuestionData(
                "We’ll close all the windows in case it ______ while we are out.",
                "rains",
                "rained",
                "will rain",
                "rain",
                "rains"
                //4, 131
        ));

        //30
        upperIntermediate.add(new QuestionData(
                "Some patients shout in pain while ______ an injection.",
                "giving",
                "being given",
                "given",
                "have been given",
                "being given"
                //4, 136
        ));

        //31
        upperIntermediate.add(new QuestionData(
                "We ______ at the Italian restaurant last night, but it was full, so we ate somewhere else.",
                "were eating",
                "were going to eat",
                "are going to eat",
                "had eaten",
                "were going to eat"
                //4, 142
        ));

        //32
        upperIntermediate.add(new QuestionData(
                "In the years ahead, it seems likely that people ______ even greater control over nature.",
                "to acquire",
                "will be acquired",
                "will acquire",
                "will have been acquired",
                "will acquire"
                //4, 149
        ));

    }

    public List<QuestionData> getElementaryTest() {
        Collections.shuffle(elementary);
        return elementary;
    }

    public List<QuestionData> getPreIntermediateTest() {
        Collections.shuffle(preIntermediate);
        return preIntermediate;
    }

    public List<QuestionData> getIntermediateTest() {
        Collections.shuffle(intermediate);
        return intermediate;
    }

    public List<QuestionData> getUpperIntermediateTest() {
        Collections.shuffle(upperIntermediate);
        return upperIntermediate;
    }
}
